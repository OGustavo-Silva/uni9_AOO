package br.uninove.servlets;

import br.uninove.pojo.PitagorasModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Pitagoras extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String hipotenusa, cateto1, cateto2;
            hipotenusa = (request.getParameter("hipotenusa")!= null)
                    ?request.getParameter("hipotenusa"):"?";
            
            cateto1 = (request.getParameter("cateto1")!= null)
                    ?request.getParameter("cateto1"):"?";
            
            cateto2 = (request.getParameter("cateto2")!= null)
                    ?request.getParameter("cateto2"):"?";
            
            double resultado = 0;
            String mensagem = "";
            
            if(hipotenusa.equals("?")){
                if(!cateto1.contains("?") && !cateto2.contains("?")){
                    double c1, c2;
                    c1 = Double.parseDouble(cateto1);
                    c2 = Double.parseDouble(cateto2);
                    resultado = PitagorasModel.pitagorasPorCatetos(c1, c2);
                }else{
                    resultado = Double.NaN;
                    mensagem = "Nenhum valor foi informado";
                }
            }else{
                if(!cateto1.contains("?") || !cateto2.contains("?")){
                    resultado = Double.NaN;
                    mensagem = "Catetos não foram informados";
                }
                if(!cateto1.contains("?") || !cateto2.contains("?")){
                    double h, c;
                    h = Double.parseDouble(hipotenusa);
                    c = cateto1.contains("?")?
                            Double.parseDouble(cateto2):Double.parseDouble(cateto2);
                    if(c > h){
                        mensagem = "O cateto não pode ser maior que a hipotenusa";
                    }else{
                        resultado = PitagorasModel.pitagorasPorHipotenusa(h, c);
                    }
                    
                }
            }           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Pitágoras Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado - Pitágoras</h1>");
            out.println("<hr>");
            out.println("Hipotenusa: " + hipotenusa);
            out.println("<br>");
            out.println("Cateto 1: " + cateto1);
            out.println("<br>");
            out.println("Cateto 2: " + cateto2);
            out.println("<br>");
            if(mensagem.isEmpty()){
                out.println("Resultado: " + String.valueOf(resultado));
                out.println("<br>");
            }else{
                out.println("Resultado: " + (Double.isNaN(resultado)?"Inconclusivo":String.valueOf(resultado)));
                out.println("Erro: " + mensagem);
                out.println("<br>");
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

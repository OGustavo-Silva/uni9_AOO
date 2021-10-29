package br.uninove.pojo;

public class PitagorasModel {
    public static double pitagorasPorCatetos(double cateto1, double cateto2){
        double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
        //h^2 = c1^2 + c2^2
        return hipotenusa;
    }
    
    public static double pitagorasPorHipotenusa(double hipotenusa, double cateto){
        double cateto2 = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(cateto, 2));
        return cateto2;
    }
    
}

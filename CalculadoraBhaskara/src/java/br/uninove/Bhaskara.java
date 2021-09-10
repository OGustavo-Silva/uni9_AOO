package br.uninove;

public class Bhaskara {

    private String a;
    private String b;
    private String c;

    //Encapsulamento
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    //Métodos
    public double calculaDelta(){
        double aD, bD, cD, delta;
        
        aD = Double.parseDouble(a);
        bD = Double.parseDouble(b);
        cD = Double.parseDouble(c);
        
        delta = (bD * bD) - 4 * aD * cD;
        return delta;
    }
    
    public double raizPositiva(double delta){
        if(delta < 0){
            return Double.NaN;
        }else{
             double aD, bD, cD;
        
            aD = Double.parseDouble(a);
            bD = Double.parseDouble(b);
        
            double raizP = (-bD + Math.sqrt(delta)) / (2*aD);
            return raizP;
        }
    }
    
    public double raizNegativa(double delta){
        if(delta < 0){
            return Double.NaN;
        }else{
             double aD, bD, cD;
        
            aD = Double.parseDouble(a);
            bD = Double.parseDouble(b);
        
            double raizP = (-bD - Math.sqrt(delta)) / (2*aD);
            return raizP;
        }
    }
    
}

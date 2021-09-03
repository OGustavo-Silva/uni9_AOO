package br.uninove;

public class Matematica {
    float a, b;
    
    public Matematica(float a, float b){
        this.a = a;
        this.b = b;
    }
    
    public float somar(){
        return a + b;
    }
    
    public float subtrair(){
        return a -b;
    }
    
    public float multiplicar(){
        return a *b;
    }
    
    public float dividir(){
        if(b!= 0)
            return a / b;
        return Float.NaN;
    }
}

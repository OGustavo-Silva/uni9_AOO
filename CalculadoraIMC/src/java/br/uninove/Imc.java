package br.uninove;

public class Imc {
    private float peso;
    private float altura;
    private String classificacao;
    private String cor;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    //Métodos
    public float calculaIMC(){
        float imc = peso / (altura*altura);
        geraClassificacao(imc);
        return imc;
    }
    
    private void geraClassificacao(float imc){
        if(imc < 16){
            classificacao = "Magreza grau III";
            cor = "#ff0000";
        }else if(imc >=16 && imc <=16.9){
            classificacao = "Magreza grau II";
            cor = "$ff2b2b";
        }else if(imc >16.9 && imc <=18.4){
            classificacao = "Magreza grau I";
            cor = "#ff6969";
        }else if(imc >18.4 && imc <=24.9){
            classificacao = "Adequado";
            cor = "#00ffff";
        }else if(imc >24.9 && imc <=29.9){
            classificacao = "Pré obeso";
            cor = "#fa7900";
        }else if(imc >29.9 && imc <=34.9){
            classificacao = "Obesidade grau I";
            cor = "#ff6969";
        }else if(imc >34.9 && imc <=39.9){
            classificacao = "Obesidade grau II";
            cor = "#ff2b2b";
        }else{
            classificacao = "Obesidade grau III";
            cor = "#ff0000";
        }
    }
    
}

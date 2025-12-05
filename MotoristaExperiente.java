package Transporte;

public class MotoristaExperiente extends Motorista {
    private double notaMedia;

    public MotoristaExperiente(String nome, int numeroDeCorridas, double valorTotalArrecadado, double notaMedia){
        super(nome, numeroDeCorridas, valorTotalArrecadado);
        this.notaMedia = notaMedia;
    }

    public double getnotaMedia(){
        return notaMedia;
    }

    public double calcularValorCorrida(){
    double valor = getvalorTotalArrecadado() * 0.75;
    double bonus = getvalorTotalArrecadado() * 0.05;
    if(notaMedia > 4.6){
        return valor + bonus;
    } else {
        return valor;
    }
}

     public String toString(){
        return "Experiente: " + "\n"+
        "Nome: " + getnome() + "\n" +
        "Nº de corridas:" + getnumeroDeCorridas() + "\n" +
        "Valor Arrecadado: " + getvalorTotalArrecadado() + "\n" +
        "Nota Média: " + notaMedia + "\n" +
        ".";
    }   
    

    
    
    
    
}

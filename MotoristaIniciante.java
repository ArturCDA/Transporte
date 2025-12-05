package Transporte;

public class MotoristaIniciante extends Motorista{
    public MotoristaIniciante(String nome, int numeroDeCorridas, double valorTotalArrecadado ){
        super(nome, numeroDeCorridas, valorTotalArrecadado);
    }

    public double calcularValorCorrida(){
        return getvalorTotalArrecadado() * 0.3;
    }

    public String toString(){
        return "Iniciante: " + "\n"+
        "Nome: " + getnome() + "\n" +
        "Nº de corridas:" + getnumeroDeCorridas() + "\n" +
        "Valor Arrecadado: " + getvalorTotalArrecadado() + "\n" +
        ".";
    }
}

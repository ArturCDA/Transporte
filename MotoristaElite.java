package Transporte;

public class MotoristaElite extends MotoristaExperiente{
    private int numeroDeCorridasPremium;
    public MotoristaElite(String nome, int numeroDeCorridas, double valorTotalArrecadado, double notaMedia, int numeroDeCorridasPremium){
        super(nome, numeroDeCorridasPremium, valorTotalArrecadado, notaMedia);
        this.numeroDeCorridasPremium = numeroDeCorridasPremium;
    }

    public int getnumeroDeCorridasPremium(){
        return numeroDeCorridasPremium;
    }

    public double calcularValorCorrida(){
        double valor = getvalorTotalArrecadado() * 0.80;
        double bonus = getvalorTotalArrecadado() * 0.05;
        double extra = numeroDeCorridasPremium * 5;
        if(getnotaMedia() > 4.6){
            return valor + bonus + extra;
        } else{
            return valor;
        }
    }

    public String toString(){
        return "Elite: " + "\n"+
        "Nome: " + getnome() + "\n" +
        "Nº de corridas:" + getnumeroDeCorridas() + "\n" +
        "Valor Arrecadado: " + getvalorTotalArrecadado() + "\n" +
        "Nota Média: " + getnotaMedia() + "\n" +
        "Nº de corridas premium:" + numeroDeCorridasPremium + "\n" +
        ".";
    }   
}

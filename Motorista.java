package Transporte;

public abstract class Motorista {
    private String nome;
    private int numeroDeCorridas;
    private double valorTotalArrecadado;

    public Motorista(String nome, int numeroDeCorridas, double valorTotalArrecadado){
        this.nome = nome;
        this.numeroDeCorridas = numeroDeCorridas;
        this.valorTotalArrecadado = valorTotalArrecadado;
    }

    public String getnome(){
        return nome;
    }

    public int getnumeroDeCorridas(){
        return numeroDeCorridas;
    }

    public double getvalorTotalArrecadado(){
        return valorTotalArrecadado;
    }


    public abstract double calcularValorCorrida();
    


    
}

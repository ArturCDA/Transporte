package Transporte;

public class Principal {
    public static void main(String[] args) {
        EmpresaTransporte F = new EmpresaTransporte();

        MotoristaIniciante Rogerio = new MotoristaIniciante("Rogerio", 20, 200);
        MotoristaElite Marcos = new MotoristaElite("Marcos", 50, 500, 5, 10);
        MotoristaExperiente Sergio = new MotoristaExperiente("Sergio", 40, 500, 12);
        MotoristaIniciante Paulo = new MotoristaIniciante("Paulo", 14, 300);
        MotoristaIniciante Joao = new MotoristaIniciante("Joao", 11, 150);

        F.cadastrarMotorista(Joao);
        F.cadastrarMotorista(Marcos);
        F.cadastrarMotorista(Paulo);
        F.cadastrarMotorista(Sergio);
        F.cadastrarMotorista(Rogerio);

        F.gerarRelatorioMotoristas();

        double total = F.calcularPagamentoTotal();//POLIMORFISMO, pois dentro desse método está um outro método abstrato utilizado em todas as classes herdeiras de motorista.
        System.out.println(total);

        Motorista m = F.pesquisarMotoristaPeloNome("Marcos");
        System.out.println(m);

        F.excluirMotoristaPeloNome("Marcos");
        
        F.gerarRelatorioMotoristas();




    }
    
    
}

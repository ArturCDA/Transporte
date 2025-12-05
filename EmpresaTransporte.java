package Transporte;

public class EmpresaTransporte {
    private Motorista [] motoristas;
    private int quantidade;

    public EmpresaTransporte (){
        motoristas = new Motorista[20];
        quantidade = 0;
    }

    public void cadastrarMotorista(Motorista motorista){
        if(quantidade < motoristas.length){
            motoristas[quantidade] = motorista;
            quantidade++;
        }
    }

    public Motorista pesquisarMotoristaPeloNome(String nome){
        for(int i = 0; i < quantidade; i++){
           if(motoristas[i].getnome().equals(nome)){
            return motoristas[i];
           }
        } return null;
    }

    public Motorista excluirMotoristaPeloNome(String nome){
        for(int i = 0; i < quantidade; i++){
           if(motoristas[i].getnome().equals(nome)){
            for(int j = i; j < quantidade - 1; j++){
                motoristas[j] = motoristas[j + 1];
            }
            motoristas[quantidade - 1] = null;
            quantidade--;
           }
        } return null;
    }

    public double calcularPagamentoTotal(){
        double total = 0;
        for(int i = 0; i < quantidade; i++){
            return total += motoristas[i].calcularValorCorrida();
        }
        return total;
    }

    public void gerarRelatorioMotoristas(){
        for(int i = 0; i < quantidade; i++){
            System.out.println(motoristas[i]);
        }
    }    
    
}
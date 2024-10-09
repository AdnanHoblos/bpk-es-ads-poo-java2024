package Ex4_ContaBancaria;

//4 - Crie uma classe ContaBancaria com atributos como numeroConta e saldo.
// Adicione métodos para depositar e sacar dinheiro.

public class ContaBancaria {

    private Integer numeroConta;
    private Double saldo;

    public ContaBancaria(Integer numeroConta, Double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    void depositar (){
        saldo = saldo + 12.0;
        System.out.println("Depositando 12 na conta" + numeroConta + "\n" + "Saldo: " + saldo);
    }

    void sacar (){
        saldo = saldo - 12.0;
        System.out.println("Sacando 12 na conta" + numeroConta + "\n" + "Saldo: " + saldo);
    }

    @Override
    public String toString() {
        return "ContaBancaria " + numeroConta + " Saldo" + saldo;
    }
}

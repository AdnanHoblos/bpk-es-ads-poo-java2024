package Ex4_ContaBancaria;

public class MainContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria(1515,12.0);
        System.out.println(conta1);

        conta1.depositar();

        conta1.sacar();

    }
}

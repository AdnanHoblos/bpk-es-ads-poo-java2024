package Ex6_Computador;

public class MainComputador {
    public static void main(String[] args) {
        Computador pc1 = new Computador ("AMD Phenom 8", "16GB CORSAIR", "1TB");
        System.out.println(pc1);

        pc1.ligar();

        pc1.desligar();
    }
}
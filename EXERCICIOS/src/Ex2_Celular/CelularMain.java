package Ex2_Celular;

public class CelularMain {
    public static void main(String[] args) {
        Celular celular1 = new Celular ("Xiaomi","Redmi 9A", 100);
        System.out.println(celular1);

        celular1.ligar();
        celular1.desligar();
    }
}

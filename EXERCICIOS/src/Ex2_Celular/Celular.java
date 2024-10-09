package Ex2_Celular;//2 - Defina uma classe Ex2_Celular.Celular com atributos como marca, modelo, e capacidadeBateria.
// Adicione métodos para ligar e desligar o celular.

public class Celular {
    private String marca;
    private  String modelo;
    private Integer capacidadeBateria;

    public Celular(String marca, String modelo, Integer capacidadeBateria) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeBateria = capacidadeBateria;
    }

    void ligar(){
        System.out.println("Ex2_Celular.Celular está ligado");
    }
    void desligar(){
        System.out.println("Ex2_Celular.Celular está desligado");
    }

    @Override
    public String toString() {
        return "Ex2_Celular.Celular:" + marca + "\n" + "modelo:" + modelo + "\n" + "capacidadeBateria:" + capacidadeBateria;
    }
}



package Ex6_Computador;

//6 - Crie uma classe Computador com atributos como processador, memoriaRAM, e armazenamento.
// Adicione métodos para ligar e desligar o computador.

public class Computador {

    private String processador;
    private String memoriaRAM;
    private String armazenamento;

    public Computador (String processador, String memoriaRAM, String armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }


        void ligar (){
            System.out.println("O computador está ligando!");
        }

        void desligar (){
            System.out.println("O computador desligou!");
        }

    @Override
    public String toString() {
        return "Computador " + "processador=" + processador + ", memoriaRAM= " + memoriaRAM + "armazenamento= " + armazenamento;
    }
}

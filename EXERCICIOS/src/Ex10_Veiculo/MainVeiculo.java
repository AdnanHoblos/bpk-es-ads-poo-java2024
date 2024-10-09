public class MainVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("SUV", "AAA333", "Roxo");

        System.out.println("Tipo: " + veiculo.getTipo());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Cor: " + veiculo.getCor());

        veiculo.abastecer();
        veiculo.lavar();
    }
}
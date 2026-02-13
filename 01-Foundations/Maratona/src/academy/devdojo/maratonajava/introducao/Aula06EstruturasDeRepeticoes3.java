package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticoes3 {
    public static void main(String[] args) {
        //dado um valor de um carro descubra quantas vezes pode ser parcelado
        //valor da parcela tem que ser maior que 1000
        double valorCarro = 40000;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela "+parcela+ " R$ "+valorParcela);
        }
    }
}

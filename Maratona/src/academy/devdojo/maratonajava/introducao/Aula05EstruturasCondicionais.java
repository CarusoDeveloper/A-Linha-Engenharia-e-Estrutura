package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComprarBebida = idade >= 18;
        // !
        if (isAutorizadoComprarBebida) {
            System.out.println("autorizado venda de bebida alcoolica");
        } else {
            System.out.println("Proibido venda de bebida alcoolica");
        }


        if (!isAutorizadoComprarBebida) {
            System.out.println("Não Autorizado compra de bebida alcoolica");
        }
    }
}

package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        //dados os valores de 1 a 7 imprima se dia útil ou final de semana considerando 1 como domingo
        byte dia = 7;

        switch (dia) {
            case 1:
                System.out.println("dom");
                break;
            case 2:
                System.out.println("seg");
                break;
            case 3:
                System.out.println("ter");
                break;
            case 4:
                System.out.println("qua");
                break;
            case 5:
                System.out.println("qui");
                break;
            case 6:
                System.out.println("sex");
                break;
            case 7:
                System.out.println("sab");
                break;

            default:
                System.out.println("Digite uma datá válida");
        }
        if (dia > 1 && dia <= 6) {
            System.out.println("Dia Útil");
        } else {
            System.out.println("Final de Semana");
        }

    }
}

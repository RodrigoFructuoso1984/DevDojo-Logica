//Receba o número do usuário e imprima o dia da semana correspondente
//Sendo 1 para Segunda-Feira
//Sendo 2 para Terça-Feira
//Sendo 3 para Quarta-Feira
//Sendo 4 para Quinta-Feira
//Sendo 5 para Sexta-Feira
//Sendo 6 para Sábado
//Sendo 7 para Domingo
public class DiasDaSemana {
    public static void main(String[] args) {
        int dia = 7;
        switch (dia) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6:
                System.out.println("Sabadão");
                break;
            case 7:
                System.out.println("Domingão");
                break;
            default:
                System.out.println("Dia inválido");
        }

    }
}

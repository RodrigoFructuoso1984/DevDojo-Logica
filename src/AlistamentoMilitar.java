import java.util.Scanner;

/*
Como secretário do alistamento militar eu gostaria que meu sistema aceitasse os seguintes parâmetros
para que eu possa agilizar o processo de cadastramento:
sexo, sendo válido apenas M ou F e idade.
Se o sexo for Masculino e a idade for maior ou igual a 18 o sistema deve imprimir alistamento obrigatório
Se o sexo for Masculino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
Se o sexo for Feminino e a idade for maior que ou igual a 18 o sistema deve perguntar se a pessoa deseja se alistar
Se o sexo for Feminino e a idade for menor que 18 o sistema deve imprimir, alistamento não permitido
 */

public class AlistamentoMilitar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o seu sexo[M/F]: ");
        String sexo = input.next();
        if (sexo.equals("M") || sexo.equals("F")) {
            System.out.println("Digite a sua idade: ");
            int idade = input.nextInt();
            if (sexo.equals("M") && idade >= 18) {
                System.out.println("Alistamento Obrigatório!");
            } else {
                if (sexo.equals("F") && idade >= 18) {
                    System.out.println("Deseja Se Alistar?");
                } else {
                    System.out.println("Alistamento Não Permitido!");
                }
            }
        } else {
            System.out.println("Dado inválido, somente digitar M ou F");
        }
    }
}

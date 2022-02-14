/*
Dado um determinado salário
Se o salário for maior que 4500 imprima 30% do valor
Senão imprima 15& do valor
Desafio: Utilize apenas uma variável para guardar o resultado e imprimir no final
Desafio2: Diga na impressão se é 30% ou 10%
 */
public class CalculadoraImpostoComCondicional {
    public static void main(String[] args) {
        float salario = 4100.50F;
        float resultado = 0F;
        String porcentagem = "";
        if (salario > 4500) {
            resultado = salario * 0.3F;
            porcentagem = "30%";
        } else {
            resultado = salario * 0.1F;
            porcentagem = "10%";
        }
        System.out.println("O valor final em porcentagem de " + porcentagem + " é de " + resultado);
    }
}

import java.util.Scanner;
public class Vendas{
    public static void main(String[] args) {
        String nome;
        Integer totalvendas;
        float salario, total;

        Scanner valor = new Scanner(System.in);
        System.out.println("Digite nome do funcionário: ");
        nome = valor.nextLine();
        System.out.println("Digite salário do funcionário: ");
        salario = valor.nextFloat();
        System.out.println("Digite o total de vendas no mês: ");
        totalvendas = valor.nextInt();

        total = salario + totalvendas*15/100;
        System.out.println("Nome do funcionário: " + nome);
        System.out.printf("Salário fixo: " + "%.2f", salario);
        System.out.println(" ");
        System.out.printf("Salário no final do mês: " + "%.2f", total);






    }
}
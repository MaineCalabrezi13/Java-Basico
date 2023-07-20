import java.util.Scanner;

public class Somar{
    public static void main(String[] args) {
        Integer n1, n2, soma;

        Scanner valor = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        n1 = valor.nextInt();
        System.out.println("Digite outro valor: ");
        n2 = valor.nextInt();
        soma = n1 + n2;
        System.out.println("Resultado da soma é: " + soma);
    }
}
import java.util.Scanner;
public class Calcular{
   public static void main(String[] args) {
    Integer n1, n2, soma, sub;
    float div, mult;

    Scanner valor = new Scanner(System.in);
    System.out.println("Digite um valor: ");
    n1 = valor.nextInt();
    System.out.println("Digite outro valor: ");
    n2 = valor.nextInt();

    soma = n1 + n2;
    sub = n1 - n2;
    div = n1/n2;
    mult = n1*n2;

    System.out.println("Resultado da soma é: " + soma);
    System.out.println("Resultado da subtração é: " + sub);
    System.out.println("Resultado da multiplicação é: " + mult);
    System.out.printf("Resultado da divisão é: " +  div);


   }
}
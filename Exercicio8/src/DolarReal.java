import java.util.Scanner;
public class DolarReal{
    public static void main(String[] args) {
      float cotacao, dolar, real;
      
    Scanner valor = new Scanner(System.in);
    System.out.println("Digite cotação do dólar: ");
    cotacao = valor.nextFloat();
    System.out.println("Digite valor em dólar: ");
    dolar = valor.nextFloat();

    real = cotacao * dolar;
    System.out.print("O valor em reais é: " + real);

    }
}
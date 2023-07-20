import java.util.Scanner;

public class LojaMamao{
public static void main(String[] args) {
    float valor, prestacao;

    Scanner ler = new Scanner(System.in);
    System.out.println("Digite valor da compra: ");
    valor = ler.nextFloat();
    prestacao = valor/5;
    System.out.print("O valor da prestação fica em 5x de " + prestacao + "R$" );
}
}
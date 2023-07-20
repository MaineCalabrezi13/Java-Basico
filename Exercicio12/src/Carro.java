import java.util.Scanner;
public class Carro{
    public static void main(String[] args) {
        double fabrica, fim;
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite o custo de fábrica do carro: ");
        fabrica = valor.nextDouble();
        fim = fabrica + (0.45 * fabrica);
        fim = fim + (0.28 * fim);

        System.out.println("O custo final para o consumidor é: " + fim);
    }
}
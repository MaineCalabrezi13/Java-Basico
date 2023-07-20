
import java.util.Scanner;
    public class Temperatura{
    public static void main(String[] args) {
        float C, F;

        Scanner valor = new Scanner(System.in);
        System.out.println("Digite temperatura em Graus Celsius: ");
        C = valor.nextFloat();
    
        F = (9*C+160)/5;

        System.out.println("Em Fahrenheit fica: " + F);
    }
    }
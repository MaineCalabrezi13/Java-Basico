import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;
public class Maior10{
public static void main(String[] args) {
    Integer num,maior;
    maior = 0;
    
    Scanner valor = new Scanner(System.in);
System.out.println("Digite um número");
num = valor.nextInt();

if (num >= 10) {
System.out.println("Maior que 10");
}

}
}
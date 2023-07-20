import java.util.Scanner;

public class Trocar {
    public static void main(String[] args) {
int a, b, c, d;

Scanner valor = new Scanner (System.in);
System.out.println("Digite valor de A");
a = valor.nextInt();
System.out.println("Digite valor de B");
b = valor.nextInt();

c = b;
d = a; 

System.out.println("Valor de A: "+c);
System.out.println("Valor de B: " + d);


    }
}
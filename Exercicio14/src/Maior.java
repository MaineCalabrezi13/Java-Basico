import java.util.Scanner;
public class Maior{
public static void main(String[] args) {
    
    Integer n1,n2,maior;
    maior = 0;

    Scanner valor = new Scanner(System.in);
    System.out.println("Digite número 1: ");
    n1 = valor.nextInt();
     System.out.println("Digite número 2: ");
    n2 = valor.nextInt();

    if(n1>n2){
    maior = n1;    
    }
    if(n2>n1){
    maior = n2;
}
System.out.println("O maior número é: "+ maior);
}
}
import java.util.Scanner;
public class NumeroMaior{
public static void main(String[] args) {
    Integer num,maior= 0,menor = 0,igual = 0;
    String resul = " ";
    Scanner valor = new Scanner(System.in);
    System.out.println("Digite um número: ");
    num = valor.nextInt();
    
    if (num>80){
        resul = " Maior que 80";   
    }
    if(num<25){
        resul = "Menor que 25";
    }
    if(num==40){
        resul = "Igual a 40";
    }
    System.out.print(resul);
}
}
import java.util.Scanner;

public class Gasolina {
 public static void main(String[] args) {
    float km1, km2, litros, totalkm , total;
    Scanner valor = new Scanner(System.in);
    System.out.println("KM inicial");
    km1 = valor.nextFloat();
    System.out.println("KM final");
    km2 = valor.nextFloat();
    System.out.println("Litros colocado");
    litros = valor.nextFloat();
    totalkm = km2 - km1; 
    total = litros/totalkm;

    System.out.println("Distância total percorrida: " + totalkm);
    System.out.printf("Total de combustível gasto: " + total);

 }   
}
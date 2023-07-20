import java.util.Scanner;

public class Deposito {
public static void main(String[] args) {
 float valo, rendimento, juros;
 
 Scanner valor = new Scanner(System.in);
 System.out.println("Digite valor depositado: ");
 valo = valor.nextFloat();

 juros = (valo * 0.70)/100;
 rendimento = juros + valo;

 System.out.print("O rendimento da poupança no mês foi de: " + rendimento +"R$");
}

}
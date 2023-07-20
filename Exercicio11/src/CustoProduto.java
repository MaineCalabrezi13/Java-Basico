import java.util.Scanner;
public class CustoProduto{
public static void main(String[] args) {
    float custo, venda, percentual;
    Scanner valor = new Scanner(System.in);
    System.out.println("Digite custo do produto: ");
    custo = valor.nextFloat();
    System.out.println("Digite percentual: ");
    percentual = valor.nextFloat();
    percentual = (percentual/100) * custo;
    venda = custo + percentual;
    System.out.println("O valor da venda é: " + venda);

}    
}
import java.util.Scanner;
public class Produtos{
    public static void main(String[] args) {
        float venda = 0, custo = 0 ,media1 = 0, media = 0,soma = 0,som = 0;
        String resul = " ";
        Integer i = 0, j = 0, k = 0;

        Scanner valor = new Scanner(System.in);

        for (i = 1; i<=2; i++){

            
        System.out.println("Digite preço de custo: ");
        custo = valor.nextFloat();
        j++;
        soma = (soma + custo) ;
        System.out.println("Digite preço de venda: ");
        venda = valor.nextFloat();
        k++;
        som = (som + venda);
        if (venda>custo){
            System.out.println("Houve lucro"); 
        }
        if (venda<custo){
            System.out.println("Houve prejuízo");
        }
        if (venda == custo){
            System.out.println("Houve empate");
        }
        }
media1 = (soma/j);
media = (som/k);

System.out.println("Média do preço de custo: "+ media1);
System.out.println("Média do preço de venda: "+ media);
    }
}
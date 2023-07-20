import java.util.Scanner;
 public class Crescente{
    public static void main(String[] args) {
        Integer n1,n2,n3,maior = 0, menor = 0, meio = 0;
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite número 1: ");
        n1 = valor.nextInt();
        System.out.println("Digite número 2: ");
        n2 = valor.nextInt();
        System.out.println("Digite número 3: ");
        n3 = valor.nextInt();

        if((n1 > n2) && (n2 > n3)){
            maior=n1;
            meio= n2;
            menor=n3 ;
        }

else if((n1 > n3) && (n3 > n2)){
maior=n1;
meio=n3;
menor=n2;
}
else if((n2 > n1) && (n1 > n3)){
maior=n2;
meio=n1;
menor=n3;
}

else if((n2 > n3) && (n3 > n1)){
maior=n2;
meio=n3;
menor=n1;
}

else if((n3 > n1) && (n1 > n2)){
maior=n3;
meio=n1;
menor=n2;
}
else if((n3 > n2) && (n2 > n1)){
maior=n3;
meio=n2;
menor=n1;
    }
    System.out.print(menor + " " +meio +" " + maior );
 }   
 }

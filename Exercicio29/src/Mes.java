import java.util.Scanner;
public class Mes{
    public static void main(String[] args) {
        Integer num;
        String resul = " ";
        Scanner valor = new Scanner(System.in);

    
        System.out.println("Digite número do mês");
        num = valor.nextInt();
      
        if(num ==1){
            resul = "Janeiro";
        }
        if(num == 2){
            resul = "Fevereiro";
        }
        if(num ==3){
            resul = "Março";
            
        }
        if(num == 4){
            resul = "Abril";
            
        }
        if(num == 5){
            resul = "Maio";
            
        }
        if(num == 6){
            resul = "junho";
            
        }
        if(num == 7){
            resul = "Julho";
            
        }
        if(num == 8){
            resul = "Agosto";
            
        }
        if(num == 9){
            resul = "Setembro";
            
        }
        if(num == 10){
            resul = "Outubro";
            
        }
        if(num == 11){
            resul = "Novembro";
            
        }
        if(num == 12){
            resul = "Dezembro";
            
        }
        System.out.print(resul);
    }
    }

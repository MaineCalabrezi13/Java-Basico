import java.util.Scanner;
public class Funcionario{
    public static void main(String[] args) {
        String nome,sexo;
        float salario = 0, salarioli =0 ;
        Integer idade;

        Scanner valor = new Scanner(System.in);
        System.out.println("Digite nome do funcionário: ");
        nome = valor.nextLine();
        System.out.println("Digite sexo do funcionário M/F: ");
        sexo = valor.nextLine();
        System.out.println("Digite idade do funcionário: ");
        idade = valor.nextInt();
    

        System.out.println("Digite salário do funcionário: ");
        salario = valor.nextFloat();

        if(sexo == "M"){
            if (idade>=30)
                salarioli = salario +150;
            
            if(idade<30)
            salarioli = salario+50;
            
        
        if (sexo == "F"){
           if (idade>=30)
           salarioli = salario + 200;
            
            if(idade<30)
            salarioli = salario+80;
            
        }}
    System.out.println("Nome: "+ nome);
    System.out.println("Salário líquido: "+ salarioli);
    }
}

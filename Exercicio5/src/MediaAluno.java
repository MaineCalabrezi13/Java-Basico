import java.util.Scanner;
public class MediaAluno{
public static void main(String[] args) {
    float nota1, nota2, nota3 , media;
    int num;
    String nome;
    Scanner Ler = new Scanner(System.in);
    System.out.println("Digite nomme do aluno");
    nome = Ler.nextLine();
    System.out.println("Digite nota 1");
    nota1 = Ler.nextFloat();
    System.out.println("Digite nota 2");
    nota2 = Ler.nextFloat();
    System.out.println("Digite nota 3");
    nota3 = Ler.nextFloat();

    media = (nota1+nota2+nota3)/3;
    System.out.printf(nome + "Sua média foi : " + "%.2f", media);

}

}
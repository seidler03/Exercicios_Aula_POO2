import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
      new Pessoa("Matheus", 20,1.80);
     Scanner input = new Scanner(System.in);
     System.out.println("Digite o numero que deseja saber se é par ou impar");
     int recebeNumero = input.nextInt();
     new ParOuImpar(recebeNumero);
    }
}
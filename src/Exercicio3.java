import java.util.Scanner;

public class Exercicio3{
    public static void main(String []args){
        Scanner teclado = new Scanner(System.in);
        for (int i = 1; i < 2; i++) {
        System.out.println("Digite um nome:");
        String nome1 = teclado.nextLine();     
    }   System.out.println("Digite a idade:");   
        int idade1 = teclado.nextInt();
        for (int i = 1; i <= 4; i++){ 
        System.out.println("Digite o próximo nome:");
        String nome = teclado.nextLine();
        System.out.println("Digite a idade:");
        int idade = teclado.nextInt();
        System.out.println("A soma de todas as idades é "+idade1+idade);
    }
    }
}
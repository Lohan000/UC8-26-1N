
package aula03_02;

import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author LOHANNUNESRODRIGUES
 */
public class Aula03_02 {


    public static void main(String[] args) {
        Scanner entrada  =  new Scanner(System.in);
        entrada.useLocale(Locale.forLanguageTag("pt-BR"));
        
        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
      
        System.out.print("Digite o salario que gostaria: ");
        double salario = entrada.nextDouble();
        
        System.out.println("Olá, " + nome + "!");
        System.out.println("Você tem " + idade + " anos.");
        System.out.printf("O salario que voce gostaria eh: R$ %.2f%n", salario);
        
        
        
    }
    
}


package aula02;

/**
 *
 * @author LOHANNUNESRODRIGUES
 */
public class Aula02 {

    public static void main(String[] args) {
        int numero1 = 20;
        int numero2 = 4;
        
        System.out.println("A soma e igual a: " + (numero1 + numero2));
        System.out.println("A subtracao e igual a: " + (numero1 - numero2));
        System.out.println("A multiplicacao e igual a: " + (numero1 * numero2));
        if (numero2 == 0 ) {
            System.out.println("Nao ha divisao por Zero");
        } else
        System.out.println("A divisao e igual a: " + (numero1 / numero2));
    }
    
}

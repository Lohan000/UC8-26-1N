
package aula03;

/**
 *
 * @author LOHANNUNESRODRIGUES
 */
public class Aula03 {

    public static void mostrarBoasVindas(){
        System.out.println("Bem vindo ao Curso de Java!");
    }
    
    public static void mostrarCurso(String curso){
        System.out.println("Curso: " + curso);
    }
    
    public static int somar(int numero1, int numero2) {
        return numero1 + numero2;
    }
    
    public static double calcularRaiz(double numero) {
        return Math.sqrt(numero);
    }
    
    public static void main(String[] args) {
        int total = somar(-15,60);
        System.out.println("Resultado: " + total);
        
        double resultado = calcularRaiz(1024);
        System.out.println("Raiz Quadrada: " + resultado);
    }
    
}

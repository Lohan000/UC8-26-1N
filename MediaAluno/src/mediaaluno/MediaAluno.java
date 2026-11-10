
package mediaaluno;

/**
 *
 * @author LOHANNUNESRODRIGUES
 */
public class MediaAluno {
    
       public static void main(String[] args) {
        String nome = "Pablo";
        System.out.println("==========================");
        System.out.println(nome);
        System.out.println("==========================");
                
        Double nota1 = 7.0;
        System.out.println("Nota1: " + nota1);
        Double nota2 = 7.0;
        System.out.println("nota2: " + nota2);
        Double nota3 = 7.0;
        System.out.println("nota3: " + nota3);
        
        Double notatotal = (nota1 + nota2 + nota3) / 3;
            System.out.println("MediaFinal: " + notatotal);
        
        if(notatotal < 7.0){
            System.out.println("Aluno: " + nome + " Reprovado");
        } else
            System.out.println("Aluno: " + nome + " Aprovado");
        
        
        
        
    }
   
}

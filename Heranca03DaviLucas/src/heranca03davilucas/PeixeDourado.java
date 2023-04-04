package heranca03davilucas;
import java.util.Scanner;

public class PeixeDourado extends Peixe{

    Scanner leia = new Scanner(System.in);
    protected String corEscama;
    
    //Metodos     
    public void camuflar(){
        System.out.println("Camuflando...");
    }
 
    //Métodos abstratos
    
    @Override
    public void atacar(){
        System.out.println("Nao ataca");
    }
    
    @Override
    public void soltarBolha(){
        System.out.println("Soltando bolhas...");
    }
    
    @Override
    public void locomover(){
        System.out.print("Nadar do metro: ");
        int inicio = leia.nextInt();
        System.out.print("Ate o metro: ");
        int fim = leia.nextInt();
        for (int i = inicio; i < fim + 1; i++) {
            System.out.println("Metro " + i);
        }
    }
    @Override
    public void alimentar(){
        System.out.println("Racao, outros peixes, algas");
    }
    @Override 
    public void emitirSom(){
        System.out.println("Nao emite som");
    }
}

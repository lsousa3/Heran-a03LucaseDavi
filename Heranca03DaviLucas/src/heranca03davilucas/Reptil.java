package heranca03davilucas;
import java.util.Scanner;
public class Reptil extends Animal{
    protected String corEscama;
    
    
    Scanner leia = new Scanner(System.in);
    //Métodos abstratos
    @Override
    public void locomover(){
        System.out.print("Rastejar do metro: ");
        int inicio = leia.nextInt();
        System.out.print("Ate o metro: ");
        int fim = leia.nextInt();
        for (int i = inicio; i < fim + 1; i++) {
            System.out.println("Metro " + i);
        }
    }
    @Override
    public void alimentar(){
        System.out.println("Ovos, peixes, insetos, animais pequenos");
    }
    @Override 
    public void emitirSom(){
        System.out.println("Emite som");
    }
    
    
}

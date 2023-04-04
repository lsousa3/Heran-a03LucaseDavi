package heranca03davilucas;
import java.util.Scanner;
public class Mamifero extends Animal{
    Scanner leia = new Scanner(System.in);
    protected String corPelo;
    
    //Métodos abstratos
    
    @Override
    public void locomover(){
    }
    @Override
    public void alimentar(){
        System.out.println("Racao");
    }
    @Override 
    public void emitirSom(){
        System.out.println("Emite som");
    }
}

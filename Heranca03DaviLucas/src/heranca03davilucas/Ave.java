package heranca03davilucas;
import java.util.Scanner;
public class Ave extends Animal{
    Scanner leia = new Scanner(System.in);
    
    protected String corPena;
    //metodos 
    public void fazerNinho(){
        System.out.println("Criar ninho...");
    }
    
    //Métodos abstratos
    @Override
    public void locomover(){
        System.out.println("Voar");
    }
    
    @Override
    public void alimentar(){
        System.out.println("Sementes, insetos, minhoca");
    }
    @Override 
    public void emitirSom(){
        System.out.println("Emite som");
    }
}

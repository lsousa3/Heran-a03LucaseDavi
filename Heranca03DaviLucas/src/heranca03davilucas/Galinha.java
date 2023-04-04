package heranca03davilucas;
import java.util.Scanner;
public class Galinha extends Pardal {
    Scanner leia = new Scanner(System.in);
    
    protected String corPena;
    

    //metodos 
    public void ajuntarPintinhos(){
        System.out.println("Acolhendo pintinhos debaixo das asas");
    }
    
    //Métodos abstratos   
    @Override
    public void fazerNinho(){
        System.out.println("Criar ninho...");
    }
    
    @Override
    public void locomover(){
        System.out.print("Voar do metro: ");
        int inicio = leia.nextInt();
        System.out.print("Ate o metro: ");
        int fim = leia.nextInt();
        for (int i = inicio; i < fim + 1; i++) {
            System.out.println("Metro " + i);
        }
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

    


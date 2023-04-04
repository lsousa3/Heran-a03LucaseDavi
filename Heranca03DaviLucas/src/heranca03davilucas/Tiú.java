package heranca03davilucas;

import java.util.Scanner;

public class Tiú {
       protected String corEscama;
Scanner leia = new Scanner(System.in);


        //Métodos abstratos

    public void comerOvos(){
        System.out.println("Comendo ovos ...");
    } 

    
    public void locomover(){
        System.out.print("Rastejar do metro: ");
        int inicio = leia.nextInt();
        System.out.print("Ate o metro: ");
        int fim = leia.nextInt();
        for (int i = inicio; i < fim + 1; i++) {
            System.out.println("Metro " + i);
        }
        
    }
    public void alimentar(){
        System.out.println("Ovos, peixes, insetos, animais pequenos");
    }
    public void emitirSom(){
        System.out.println("Emite som");
    }
    
    
}

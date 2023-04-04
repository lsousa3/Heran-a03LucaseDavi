package heranca03davilucas;
public class Hamster extends Gato {
         //Métodos abstratos
    
   public void correrRoda(){
       System.out.println("Esta correndo na rodinha ...");
   }
    
    @Override
    public void locomover(){
        System.out.print("Caminhar do metro: ");
        int inicio = leia.nextInt();
        System.out.print("Ate o metro: ");
        int fim = leia.nextInt();
        for (int i = inicio; i < fim + 1; i++) {
            System.out.println("Metro " + i);
        }
    }
    @Override
    public void alimentar(){
        System.out.println("Sementes, capim, nozes");
    }
    @Override 
    public void emitirSom(){
        System.out.println("Emite som ...");
    }
}

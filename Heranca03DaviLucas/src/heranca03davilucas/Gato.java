package heranca03davilucas;
public class Gato extends Mamifero {
     //Métodos abstratos
    
    public void pegarBolinha(){
        System.out.println("pegando bolinha ...");
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
        System.out.println("Racao, rato, calango");
    }
    @Override 
    public void emitirSom(){
        System.out.println("Ronronando ...");
    }
    
}

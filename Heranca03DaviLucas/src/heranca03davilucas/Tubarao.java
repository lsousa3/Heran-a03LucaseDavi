package heranca03davilucas;
public class Tubarao extends PeixeDourado {
    //Metodos 

    @Override
    public void camuflar(){
        System.out.println("Nao camufla");
    }
    
    @Override
    public void atacar(){
        System.out.println("Atacar outros peixes");
    }
    
    @Override
    public void emitirSom() {
        System.out.println("Nao emite som");
    }

    @Override
    public void alimentar() {
        System.out.println("Carne");
    }

    @Override
    public void locomover() {
        System.out.print("Nadar do metro: ");
        int inicio = leia.nextInt();
        System.out.print("Ate o metro: ");
        int fim = leia.nextInt();
        for (int i = inicio; i < fim + 1; i++) {
            System.out.println("Metro " + i);
        }
    }

    @Override
    public void soltarBolha() {
        System.out.println("SOltando bolhas...");
    }
  
}

package heranca03davilucas;
public class Peixe extends Animal{

    protected String corEscama;
    //Metodos 
    
    
    public void soltarBolha(){
        System.out.println("Soltando bolhas...");
    }
    
    public void atacar(){
        System.out.println("Outros peixes");
    }
    
    //Métodos abstratos
    @Override
    public void locomover(){
        System.out.println("Nadar");
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

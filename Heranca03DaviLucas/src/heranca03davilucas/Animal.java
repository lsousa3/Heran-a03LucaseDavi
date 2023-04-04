package heranca03davilucas;
public abstract class Animal {
    //classe mãe
    protected int idade, membros;
    protected float peso;
    //Construtor

    public Animal() {
        this.idade = idade;
        this.membros = membros;
        this.peso = peso;
    }



   

    //Getter & Setter

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
    }
    
    //Metodos abstratos
    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public void Status(){
        
        System.out.println("Peso: " + this.peso);
        System.out.println("idade: " + this.idade);
        System.out.println("membros: " + this.membros);
        //System.out.println("*********************");
        
    }


    
    
    
}

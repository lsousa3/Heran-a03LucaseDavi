package heranca03davilucas;
public class Heranca03DaviLucas {
    public static void main(String[] args) {
        
    //MAMÍFERO
        Mamifero cachorro = new Mamifero();
        System.out.println("Cachorro");
        cachorro.setIdade(3);
        cachorro.setMembros(4);
        cachorro.setPeso(4);
        cachorro.Status();
        cachorro.alimentar();
        cachorro.locomover();
        cachorro.emitirSom();
        System.out.println("***********************************");
        
        Gato gato = new Gato();
        System.out.println("GATO");
        gato.setPeso(1.0f);
        gato.setIdade(2);
        gato.setMembros(5);
        gato.Status();
        gato.alimentar();
        gato.pegarBolinha();
        gato.emitirSom();
        gato.locomover();
        
        
        Hamster ratinho = new Hamster();
        ratinho.setPeso(0.5f);
        ratinho.setMembros(4);
        ratinho.setIdade(1);
        ratinho.Status();
        ratinho.alimentar();
        ratinho.emitirSom();
        ratinho.locomover();
        ratinho.correrRoda();
        
      
    //RÉPTIL
        Reptil calango = new Reptil();
        System.out.println("Calanguinho");
        calango.setIdade(2);
        calango.setMembros(4);
        calango.setPeso(1);
        calango.Status();
        calango.alimentar();
        calango.locomover();
        calango.emitirSom();
        System.out.println("***********************************");
        
        
        Tiú lagarto = new Tiú();
        System.out.println("Tiu");
        lagarto.alimentar();
        lagarto.comerOvos();
        lagarto.emitirSom();
        lagarto.locomover();
    
    //PEIXE
        Peixe nemo = new Peixe();
        System.out.println("Peixe");
        nemo.setIdade(1);
        nemo.setMembros(0);
        nemo.setPeso(0.5f);
        nemo.Status();
        nemo.alimentar();
        nemo.emitirSom();
        nemo.locomover();
        System.out.println("***********************************");
       
        Tubarao tubarao = new Tubarao();
        System.out.println("Tubarao");
        tubarao.setIdade(2);
        tubarao.setMembros(2);
        tubarao.setPeso(30.5f);
        tubarao.Status();
        tubarao.atacar();
        tubarao.camuflar();
        tubarao.locomover();
        System.out.println("*************************************");

        
        PeixeDourado dourado = new PeixeDourado();
        System.out.println("Peixe Dourado");
        dourado.setIdade(1);
        dourado.setMembros(2);
        dourado.setPeso(0.5f);
        dourado.Status();
        dourado.camuflar();
        dourado.atacar();
        System.out.println("*************************************");
        
    
    //AVE
        Ave canario = new Ave();
        System.out.println("Canario Amarelo");
        canario.setIdade(2);
        canario.setMembros(4);
        canario.setPeso(0.5f);
        canario.Status();
        canario.alimentar();
        canario.locomover();
        canario.emitirSom();
        System.out.println("*************************************");
    
        //Pardal
        Pardal pardal = new Pardal();
        System.out.println("Pardal");
        pardal.setIdade(1);
        pardal.setMembros(2);
        pardal.setPeso(0.300f);
        pardal.Status();
        pardal.alimentar();
        pardal.locomover();
        pardal.emitirSom();
        pardal.fazerNinho();
        pardal.pousar();
        System.out.println("*************************************");
        
        //Galinha
        Galinha galinha = new Galinha();
        System.out.println("Galinha");
        galinha.setIdade(5);
        galinha.setMembros(2);
        galinha.setPeso(2f);
        galinha.Status();
        galinha.alimentar();
        galinha.locomover();
        galinha.emitirSom();
        galinha.fazerNinho();
        galinha.pousar();
        galinha.ajuntarPintinhos();
        System.out.println("*************************************");
    }
    
}

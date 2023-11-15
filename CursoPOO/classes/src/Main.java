import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.PetShop;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Puppy","Marrom",25,5.5,5);
        Gato gato1 = new Gato("Felix", "Preto", 4.5);
        Passaro passaro1 = new Passaro("Frajola", "Azul", 0.5);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();

//        petShop.darBanho(cachorro1);
//        System.out.println(cachorro1.getEstadoDeEspirito());
//
//        petShop.darBanho(gato1);
//        System.out.println(gato1.getEstadoDeEspirito());
//
//        petShop.tosar(cachorro1);
//        System.out.println(ca.getEstadoDeEspirito());
//
//        System.out.println(cachorro1.getNome());
//        System.out.println(cachorro2.getPeso());

//        cachorro1.setNome("Puppy");
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);

        //cachorro1.latir();

        //System.out.println("O Cachorro pegou uma " + cachorro1.pegar());

//        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
//        System.out.println("O cachorro esta " + cachorro1.interagir("nada"));
//        System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir"));


    }
}
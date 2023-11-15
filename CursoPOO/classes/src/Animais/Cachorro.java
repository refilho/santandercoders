package Animais;

public class Cachorro extends Animal{

    //atributos
    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    //construtores padrao
    //public Cachorro(){};

    //construtor adicionados
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo) {
        super(nome, cor, altura);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros ++;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    //metodos


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
    }


    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz"; break;
            case "vai dormir":
                this.estadoDeEspirito = "bravo"; break;
            case "nada":
                this.estadoDeEspirito = "neutro"; break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste"; break;
            default:
                this.estadoDeEspirito = "neutro"; break;
        }
        return estadoDeEspirito;
    }

    @Override
    public void soar() {
        System.out.println("Au Au");
    }
}
//        if (acao.equals("carinho")){
//            this.estadoDeEspirito = "feliz";
//        } else if (acao.equals("vai dormir")) {
//            this.estadoDeEspirito = "Bravo";
//        } else {
//            this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;
//    }
//}

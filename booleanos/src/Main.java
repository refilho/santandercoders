public class Main {
    public static void main(String[] args) {

        boolean fimDeSemana = true;
        boolean fazendoSol = false;
        boolean vamosAPraia = fimDeSemana || fazendoSol;
        System.out.println(vamosAPraia);

        //Tabela verdade
        //Operador && (AND)
        //true && true = true
        //true && false = false
        //false && true = false
        //false && false = false

        //Operador || (OR)
        //true || true = true
        //true || false = true
        //false || true = true
        //false || false = false

        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        System.out.println(mensagem);
    }
}
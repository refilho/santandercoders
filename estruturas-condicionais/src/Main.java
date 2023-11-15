public class Main {
    public static void main(String[] args) {

        int nota = 100;
        String graduacao;

        //nota maior ou igual 7, aprovado.
        //nota menor que 7 reprovado

//        if(nota >=7) {
//            System.out.println("A nota do aluno foi " + nota + " Aluno aprovado");
//        } else {
//            System.out.println("A nota do aluno foi " + nota + " Aluno nao aprovado");
//        }

        if (nota >= 80) {
            graduacao = "A";
        } else if (nota < 80 && nota >= 70) {
            graduacao = "B";
        } else if (nota < 70 && nota >= 60) {
            graduacao = "C";
        } else if (nota < 60 && nota >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado");
                break;
            case "C":
            case "D":
                System.out.println("Nao Aprovado");
                break;
            default:
                System.out.println("Graduacao Invalida");
        }
    }
}

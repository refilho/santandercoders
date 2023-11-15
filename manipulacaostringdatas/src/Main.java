import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //Ola, {nome}. Hoje é {dia da semana}, BOM DIA.

        String nome = "Renan";
//        System.out.println(nome.toUpperCase());
//        System.out.println(nome.toLowerCase());
//        System.out.println(nome.length());
//
//        String nomeOutro = "renan";
//        System.out.println(nome.equalsIgnoreCase(nomeOutro));

        //ISO 8601
        LocalDate hoje = LocalDate.now();
        //Locale brasil = new Locale(language:"pt", country:"BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));
        String diaSemana = "quarta-feira";
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() <24) {
            saudacao = "boa noite";
        } else {
            saudacao = "Ola";
        }

        System.out.printf("Ola, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
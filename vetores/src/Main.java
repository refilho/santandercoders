import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int[] numeros = new int[5];
//        //[0] [1] [2] [3] [4]
//        numeros[0] = 1;
//        numeros[1] = 2;
//        numeros[2] = 3;
//        numeros[3] = 4;
//        numeros[4] = 5;
//
//        for (int i=0; i < numeros.length; i++) {
//            System.out.println(numeros[i]);
//        }

//        String[] letras = { "A", "B", "C", "J", "X"};
//        for (int i=0; i < letras.length; i++) {
//        System.out.println(letras[i]);
//        }
//        System.out.println(Arrays.toString(letras));

        int[] numeros = {9, 10, 12, 25, 2};
        int maior = numeros[0];
        int menor = numeros[0];
        int media = 0;

        for (int i=0; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            media = media + numeros[i];
        }
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Media: " + media/numeros.length);
    }
}
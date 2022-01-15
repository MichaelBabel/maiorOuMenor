import java.sql.Array;

public class Main {

    public static String maiorNome(String [] nomes) {
        int tamanho = nomes.length;
        String maiorNome = nomes[0];
        for(int i = 1; i < tamanho; i++) {
            if(nomes[i].length() > maiorNome.length()) {
                maiorNome = nomes[i];
            }
        }
        return maiorNome;
    }

    public static double maiorNota(double [] notas) {
        int tamanho = notas.length;
        double maiorNota = notas[0];
        for(int i = 1; i < tamanho; i++) {
            if(notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        return maiorNota;
    }

    public static void main(String[] args) {

        String [] nomes = {"Maiara", "Sofia"};
        System.out.println(maiorNome(nomes));

        double [] notas = {23.6, 21.1, 8.7, 23.5, 24.0};
        System.out.println(maiorNota(notas));
    }
}
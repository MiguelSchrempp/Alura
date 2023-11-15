package studies;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filmeFavorito = sc.nextLine();

        System.out.println("Qual o ano de lançamento do seu filme favorito?");
        int anoLancamento = sc.nextInt();

        System.out.println("Sua avaliação para o filme");
        double avaliacao = sc.nextDouble();

        System.out.println(filmeFavorito);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
    }
}

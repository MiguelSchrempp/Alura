package studies;

import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota = 0;
        double media = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Sua avaliação para o filme ou -1 para encerrar");
            nota = sc.nextDouble();
            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }
        }

        System.out.println("Média de avaliações: " + media / totalDeNotas);
    }
}

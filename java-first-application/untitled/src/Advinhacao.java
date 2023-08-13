import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = new Random().nextInt(100);
        int counter = 0;
        int insertedNumber;

        while (counter < 5) {
            System.out.println("Insira um número para tentar advinhar o número secreto");
            insertedNumber = sc.nextInt();

            if (insertedNumber == randomNumber) {
                System.out.println("Parabéns você acertou!!");
                break;
            } else {
                System.out.println("Não era este número :(");
            }
            counter++;
        }
    }
}

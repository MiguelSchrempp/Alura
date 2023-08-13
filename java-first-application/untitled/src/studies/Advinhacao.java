package studies;

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
            } else if (insertedNumber < randomNumber){
                System.out.println("O número secreto é maior");
            } else {
                System.out.println("O número secreto é menor");
            }
            counter++;
        }

        if (counter == 5){
            System.out.println("Acabou e você não acertou =(. O número era: " + randomNumber);
        }
    }
}

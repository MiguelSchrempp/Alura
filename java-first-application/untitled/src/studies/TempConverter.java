package studies;

public class TempConverter {
    public static void main(String[] args) {
        double celsio = 22.36;
        double fahrenheit = (celsio * 1.8) + 32;

        System.out.println("------Temperaturas------");
        System.out.println("Temperatura em graus celsius: " + celsio);
        System.out.printf("Temperatura em graus fahreinheit: %.2f", fahrenheit);
    }
}

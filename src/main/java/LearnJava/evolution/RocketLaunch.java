package LearnJava.evolution;

public class RocketLaunch {
    public static void main (String[] args) throws InterruptedException {
        System.out.println("O foguete vai decolar...\n");

            for (int i = 10; i > 0; i--) {
                System.out.printf("%ds\n", i);
                Thread.sleep(1000);
        }
        System.out.println("\nDecolar AGORA!...");
    }
}
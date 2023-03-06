public class Main {
    public static void main(String[] args) {
        int count = 0;
        int i;
        for (i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + "");
                count++;
            }
        }
        System.out.println("\nThere are " + count + "prime numbers smaller than 100");

    }
}
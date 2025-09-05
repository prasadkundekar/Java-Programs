public class RandomNumberGenerator {
    public static void main(String[] args) {
        double randomDouble = Math.random();
        int randomInt = (int)(Math.random() * 100) + 1;
        System.out.println("Random double (0.0 to 1.0): " + randomDouble);
        System.out.println("Random integer (1 to 100): " + randomInt);
    }
}   
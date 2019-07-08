public class Randomaizer {
    public int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException();
        }

        java.util.Random random = new java.util.Random();
        return random.nextInt((max - min) + 1) + min;
    }
}

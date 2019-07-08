public class Randomaizer {
    public int getRandomNumberInRange(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException();
        }

        java.util.Random random = new java.util.Random();
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }

}

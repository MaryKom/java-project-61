package hexlet.code;
import java.util.Random;

public class Utils {

    public static final int MAX_RANDOM = 100;
    public static final Random RANDOM = new Random();

    public static int getMaxRandom(int maxRandom) {
        return RANDOM.nextInt(maxRandom);
    }

    public static int getMinMaxRandom(int min, int max) {
        return RANDOM.nextInt(min, max);
    }
}

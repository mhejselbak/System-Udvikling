import java.util.Random;

/**
 * Dette er et fucking HAHAHAHAHHAHAHAHAHAHAAHAHHAHa god luck.
 */

public static class ArrayUtil {
	private Random generator = new Random();

	public int[] randomIntArray(int length, int n) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = generator.nextInt(n);
		}
		return a;
	}
    //LOL LOL LOL LOL LOL
}

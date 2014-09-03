import java.math.BigInteger;

public class Problem20 {

	public static void main(String[] args) {

		BigInteger bInt = BigInteger.valueOf(1);

		for (int i = 2; i < 100; i++) {
			bInt = bInt.multiply(BigInteger.valueOf(i));
		}

		char[] chr = bInt.toString().toCharArray();
		long max = 0;

		for(int i = 0; i < chr.length; i++) {
			max += Character.getNumericValue(chr[i]);
		}

		System.out.println(max);

	}

}
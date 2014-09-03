import java.math.BigInteger;

public class Problem15 {

	public static void main(String[] args) {


		BigInteger bInt40 = BigInteger.valueOf(1);
		BigInteger bInt20 = BigInteger.valueOf(1);

		for(int i = 1; i <= 40; i++) {

			bInt40 = bInt40.multiply(BigInteger.valueOf(i));

			if(i == 20) {
				bInt20 = bInt40;
			}

		}


		bInt20 = bInt20.multiply(bInt20);

		System.out.println(bInt40.divide(bInt20));

	}

}
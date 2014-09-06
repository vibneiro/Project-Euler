import java.math.*;

public class Problem25 {

	public static void main(String[] args) {

		BigInteger f1 = BigInteger.valueOf(1);
		BigInteger f2 = BigInteger.valueOf(1);

		BigInteger tmp;
		int i = 2;
		while(f2.toString().length() < 1000) {
			tmp = f2;
			f2 = f1.add(f2);
			f1 = tmp;
			i++;
		}

		System.out.println(i);
 	}

}

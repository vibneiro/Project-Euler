import java.math.BigInteger;

public class Problem16 {

	public static void main(String[] args) {


		BigInteger bInt = BigInteger.valueOf(2).pow(1000);
		String str = bInt.toString();

//1267650600228229401496703205376
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
			 sum += Character.getNumericValue(str.charAt(i));
		}

		System.out.println();
		System.out.println(sum);

	}
}
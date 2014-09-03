//import java.util.Math;

public class EP3 {

	public static void main(String[] args) {

		long n = 600851475143l;

		int u = (int)Math.sqrt(n);

		for (int i = u; i > 2; i--) {
			if (isPrime(i) && (n % i == 0)) {
				System.out.println(i);
			} 
		}

	}

	public static boolean isPrime(int n) {

		if (n == 2 || n == 3) return true;

		for (int i = 2; i < Math.sqrt(n); i++) {
			if (n % i == 0) return false;
		}

		return true;
	}

}
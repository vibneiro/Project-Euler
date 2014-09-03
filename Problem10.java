import java.math.*;

public class Problem10 {

	public static boolean isPrime(long n) {

		for(int i = 2; i <= Math.sqrt(n); i++) {
			if(n % i == 0) {
				return false;
			}
		}

		return true;
	}



	public static void main(String args[]) {

		long sum = 2;

		for(int i = 3; i < 2000000; i = i+2) {

			if(isPrime(i)) {
				sum += i;
				//System.out.println(i);
			}
		}

		System.out.println(sum);
	}
}
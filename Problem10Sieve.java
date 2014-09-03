import java.util.BitSet;

public class Problem10Sieve {

	public static void main(String args[]) {

		BitSet bitSet = new BitSet();

		long n = 2000000;

		for(int i = 2; i <= Math.sqrt(n); i++) {

			if(!bitSet.get(i)) {
				for(int j = i*i; j < n; j = j + i) {
					bitSet.set(j);
					//System.out.println(j);
				}
			}
		}

		long sum = 0;

		for(int i = 2; i < n; i++) {
			if(!bitSet.get(i)) {
				sum += i;
				//System.out.println(i);
			}
		}

		System.out.println(sum);
	}
}
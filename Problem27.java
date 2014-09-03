import java.util.*;
import java.math.*;

public class Problem27 {

	public static void main(String[] args) {

		BitSet primes = new BitSet(87400);

		for(int i = 2; i < 87400; i++) {

			int j = i;

			while(j < 87400) {
				j += i;
				primes.set(j);
			}
		}

//		1) 2 --> 4 6 8 ...
//		2) 3 --> 6 9 12 ...

		int max = 0;
		int product = 0;
		int aa = 0; int bb = 0;

		for (int a = -1000; a<=1000; a++) {
			for (int b = -1000; b<=1000; b++) {
				int n = 0;

				while(!primes.get(Math.abs(n*n + a*n + b))) {
					n++;
				}

				if(n > max) {
					max = n;
					product = a*b;
					aa = a;
					bb = b;
				}

			}
		}

		System.out.println(max + " " + product + " a = " + aa + " b = " + bb);
	}

}
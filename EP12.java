import java.util.*;

public class EP12 {

	public static void main(String[] args) {

		int n = 28;
		int k = 8;
		int count = 0;

		while(count <= 500) {
			n += k;
			k++;
			count = 0;
			for (int i = 1; i <= Math.sqrt(n); i++) {
				if ((n % i) == 0) {
					count++;
				}
			}
		}


		System.out.println(count);
		System.out.println(n);

	}


}
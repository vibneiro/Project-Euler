import java.math.*;

public class Problem26 {

	private static int getPeriodLength(int num) {
	
		int[] remainders = new int[num];

		int r = 1 % num;
		remainders[r] = 1;
		int count = 1;
		System.out.println("r = " + r);
		while(true) {

			r = r * 10 % num;
			System.out.println("r = " + r);

			if(r == 0 || remainders[r] == 1) {
				break;
			}

			remainders[r] = 1;
			count++;
		}
			
		return count++;
	}


	public static void main(String[] args) {

		int num; int number = 0;
		int max = 0;

		for (int i = 13; i < 14; i++) {
			num = getPeriodLength(i);
			if(num > max) {
				number = i;
				max = num;
			}
		}

		System.out.println(number + " " + max);

	}

}

public class Problem14 {

public static int getSequenceLength(long n) {

	int cnt = 0;

	while(n != 1) {

		if(n % 2 == 0) {
			n /= 2;
		} else {
			n = 3*n+1;
		}

		cnt++;
	}
	return cnt;
}


public static void main(String[] args) {

	int max = 0;

	for(int i = 1; i < 1000000; i++) {

		int n = getSequenceLength(i);

		if(n > max) {
			System.out.println("i = " + i);
			max = n;
			System.out.println(max);
		}

	}
}

}
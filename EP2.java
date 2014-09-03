public class EP2 {

	public static void main(String[] args) {

		int t1 = 1;
		int t2 = 2;
        int tmp = 0;

		int r = 0;

		while(t2 < 4000000) {
            tmp = t2;
			t2 = t1 + t2;
            t1 = tmp;
				
			if(t1 % 2 == 0) {
				r += t1;
			}
		}

		System.out.println(r);

	}

}
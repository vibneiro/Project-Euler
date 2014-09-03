
public class EP7 {

	public static void main(String[] args) {

		int i = 3;
		int c = 2;

		while(c != 10001) {
			
			i += 2;

			boolean found = false;

			for (int j = 2; j <= Math.sqrt(i); j++) {
				if ((i % j) == 0) {
					found = true;
					break;
				}
			}

			if(!found) {
				c++;
			}


		}

		System.out.println(i);

	}

}
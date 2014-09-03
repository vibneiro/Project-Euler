public class EP5 {

	public static void main(String[] args) {
	
		int i = 2520;
		boolean found = false;
		while(++i < Integer.MAX_VALUE) {

			for(int j = 2; j <= 20; j++) {
				if ((i % j) != 0) {
					break;
				}
				if (j == 20) {
					System.out.println(i);
					found = true;
					break;
				} 
			}

			if(found)
				break;

		}

	}

}
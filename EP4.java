public class EP4 {

	public static void main(String[] args) {

		int r = 0;

		for(int i = 999; i > 1; i --) {

			for(int j = 999; j > 1; j --) {
				System.out.println( "i = " + i + " j = " + j);
				int n = i*j;
				if(n > r && isPalindrome(n)) {
					r = n;
				}
			}

		}
		System.out.println(r);

	}

	public static boolean isPalindrome(int n) {
		String s = String.valueOf(n);
        
		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			} 
		}
		System.out.println("!!!" + n);
		return true;
	}
}
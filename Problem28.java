public class Problem28 {

	public static void main(String[] args) {

		int sum = 0;

		int x = 1001;

		while(x >= 3) {

			System.out.println(x);

			int top_right = x*x;
			int top_left = top_right - x + 1;
			int bottom_left = top_left - x + 1;
			int bottom_right = bottom_left - x + 1;

			System.out.println("----------------------");
			System.out.println(x);
			System.out.println(top_right + " " + top_left + " " + bottom_left + " " + bottom_right);

			sum += top_right + top_left + bottom_left + bottom_right;
			x -= 2;

		}

		System.out.println(sum+1);



	}

}
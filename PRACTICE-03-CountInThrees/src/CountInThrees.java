import java.util.Scanner;

public class CountInThrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter a number to count to:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		for (int i = 3; i <=num ; i=i+3) {
			System.out.println(i);
		}
	}

}

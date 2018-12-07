import java.util.Scanner;

public class CountUpTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Enter a number to count to:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		input.close();
		
		for (int i = 0; i <=num ; i++) {
			System.out.println(i);
		}
	}

}

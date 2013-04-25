import java.util.Scanner;


public class WarmUp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		String num = kb.nextLine();
		long a = System.nanoTime();
		//System.out.println("Enter a string -> ");
		String num1 = kb.nextLine();
		//System.out.println("Enter a number -> ");
		String number = kb.nextLine();
		long b = System.nanoTime();
		System.out.println(b-a);
	}

}





import java.util.Scanner;
public class HalloweenCandy {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int houses = input.nextInt();

		//your code goes here
		int dollarBills = 2;
		if (houses >= 3) {
			double chance = Math.ceil(((double)dollarBills / houses) * 100);
			System.out.print((int)chance);
		}
	}
}
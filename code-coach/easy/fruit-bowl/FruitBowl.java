import java.util.Scanner;
public class FruitBowl {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int fruit = input.nextInt();

		//your code goes here
		int apples = fruit / 2;
		int pies = apples / 3;
		System.out.print(pies);
	}
}
import java.util.Scanner;
public class PrimitiveOperators {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int math = scanner.nextInt();
		int history = scanner.nextInt();
		int geometry = scanner.nextInt();

		//your code goes here
		int hours = (math+history+geometry)/60;
		int minutes = (math+history+geometry)%60;

		System.out.print(hours+"\n"+minutes);
	}
}
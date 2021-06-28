import java.util.Scanner;
public class SkeeBall {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int points = scanner.nextInt();
		int cost = scanner.nextInt();

		String isEnough = points/12 >= cost ? "Buy it!": "Try again";
		System.out.print(isEnough);
	}
}
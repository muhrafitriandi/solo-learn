import java.util.Scanner;
public class GothamCity {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int criminals = scanner.nextInt();
		String says = criminals < 5 ? "I got this!": criminals >= 5 && criminals <= 10 ? "Help me Batman": "Good Luck out there!";

		System.out.print(says);
	}
}
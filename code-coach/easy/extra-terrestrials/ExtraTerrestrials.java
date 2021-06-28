import java.util.Scanner;
public class ExtraTerrestrials {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String word = scanner.next();

		System.out.print(new StringBuilder(word).reverse().toString());
	}
}
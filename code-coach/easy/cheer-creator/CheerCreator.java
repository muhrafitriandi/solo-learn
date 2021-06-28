import java.util.Scanner;
public class CheerCreator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int yards = scanner.nextInt();

		if (yards > 10) {
			System.out.print("High Five");
		}else if (yards < 1) {
			System.out.print("shh");
		}else {
			for (int i=1; i<=yards; i++) {
				System.out.print("Ra!");
			}
		}
	}
}

// NOTE: use repeat() method if you are using Java JDK 11, code can be made simpler without having to use loop.

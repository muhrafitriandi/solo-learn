import java.util.Scanner;
import java.util.ArrayList;
public class ThatsOdd {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		ArrayList<Integer> list = new ArrayList<>();

		int sum = 0;
		for (int i = 0; i < n; i++) {
			list.add(scanner.nextInt());
			if (list.get(i) % 2 == 0) {
				sum += list.get(i);
			}
		}
		System.out.print(sum);
	}
}
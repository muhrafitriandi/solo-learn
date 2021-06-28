import java.util.Scanner;
public class Argentina {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int pesos = scanner.nextInt();
		int dollars = scanner.nextInt();
		double exchangePesos = pesos * 0.02;
		String purchase = exchangePesos < dollars ? "Pesos": "Dollars";

		System.out.print(purchase);
	}
}
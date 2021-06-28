import java.util.Scanner;
public class Hovercraft {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int sales = scanner.nextInt();

		int hovercraftMonth = 10;
		int hovercraftCosts = 2000000;
		int hovercraftSelling = 3000000;
		int isuranceMonth = 1000000;

		int spentMonth = (hovercraftMonth * hovercraftCosts) + isuranceMonth;
		int incomeMonth = sales * hovercraftSelling;

		String isProfit = incomeMonth > spentMonth ? "Profit": incomeMonth < spentMonth ? "Loss": "Broke Even";
		System.out.print(isProfit);
	}
}
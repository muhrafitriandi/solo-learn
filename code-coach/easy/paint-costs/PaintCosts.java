import java.util.Scanner;
public class PaintCosts {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int numberOfColors = scanner.nextInt();
		int canvasAndBrushCost = 40;
		int colorCost = numberOfColors * 5;
		int price = canvasAndBrushCost + colorCost;

		double tax = price*0.1;
		double totalCost = price+tax;

		System.out.print(Math.round(totalCost));
	}
}
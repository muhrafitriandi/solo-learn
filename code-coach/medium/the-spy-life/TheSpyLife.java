import java.util.Scanner;
public class TheSpyLife {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String encodedMessage = scanner.nextLine();
		System.out.print(isLetter(encodedMessage));
	}

	public static String isLetter(String encodedMessage) {
		String temp = "";
		for (int i = encodedMessage.length()-1; i >= 0; i--) {
			if (encodedMessage.charAt(i) >= 'A' && encodedMessage.charAt(i) <= 'Z' ||
			    encodedMessage.charAt(i) >= 'a' && encodedMessage.charAt(i) <= 'z' ||
			    encodedMessage.charAt(i) == ' ') {
			    temp += encodedMessage.charAt(i);	
			}
		}
		return temp;
	}
}

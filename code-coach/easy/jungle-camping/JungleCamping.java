import java.util.Scanner;
public class JungleCamping {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String noises = scanner.nextLine();
		String[] splitNoises = noises.split(" ");

		String animals = "";
		for (int i=0; i<splitNoises.length; i++) {
			animals = splitNoises[i].equals("Grr") ? "Lion": splitNoises[i].equals("Rawr") ? "Tiger": splitNoises[i].equals("Ssss") ? "Snake": "Bird";
			if (i != 0) 
				System.out.print(" ");

			System.out.print(animals);
		}
	}
}
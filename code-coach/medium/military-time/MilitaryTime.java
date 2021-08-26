import java.util.Scanner;
public class MilitaryTime {
    public static void main(String[] args) {
    	
    	Scanner scanner = new Scanner(System.in);
        String time = scanner.nextLine();
        String[] splitTime = time.split(":");

        // 00:00 - 11:59 = AM
    	// 12:00 - 23:59 = PM
        if (splitTime[1].substring(3, 5).equals("AM") && ((Integer.parseInt(splitTime[0]) >= 24) || (Integer.parseInt(splitTime[1].substring(0, 2)) >= 60)))
        	System.out.print("Invalid Time");
        else if (splitTime[1].substring(3, 5).equals("PM") && ((Integer.parseInt(splitTime[0]) >= 24) || (Integer.parseInt(splitTime[1].substring(0, 2)) >= 60)))
        	System.out.print("Invalid Time");
        else if (splitTime[1].substring(3, 5).equals("AM") && ((Integer.parseInt(splitTime[0]) >= 0) && (Integer.parseInt(splitTime[0]) <= 11)))
        	System.out.print(splitTime[0] + ":" + splitTime[1].substring(0, 2));
        else if (splitTime[1].substring(3, 5).equals("PM") && (Integer.parseInt(splitTime[0]) < 12))
        	System.out.print((Integer.parseInt(splitTime[0]) + 12) + ":" + splitTime[1].substring(0, 2));
        else if (splitTime[1].substring(3, 5).equals("AM") && (Integer.parseInt(splitTime[0]) >= 12))
        	if ((Integer.parseInt(splitTime[0]) - 12) <= 9)
        		System.out.print("0" + (Integer.parseInt(splitTime[0]) - 12) + ":" + splitTime[1].substring(0, 2));
        	else
        		System.out.print((Integer.parseInt(splitTime[0]) - 12) + ":" + splitTime[1].substring(0, 2));
        else
        	System.out.print(splitTime[0] + ":" + splitTime[1].substring(0, 2));
    }
}
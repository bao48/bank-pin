import java.util.Scanner; 

public class BankPins {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter your current pin: ");
		int currentPin = reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println("Enter your new pin: ");
		int nextPin = reader.nextInt();
		
		int current[] = new int[5]; // creates current[0] through current[4]
		int next[] = new int[5];
		int i = 0;
		
		while (i <= 4) {
		    current[i] = currentPin % 10;
		    currentPin = currentPin / 10;
		    next[i] = nextPin % 10;
		    nextPin = nextPin / 10;
		    i++;
		}
		i = 0;

		int difference[] = new int[5];
		double differenceMod[] = new double[5];
		int all = 0;
		
		while (i<= 4) {
			difference[i] = (int)Math.abs(current[i] - next[i]);
			differenceMod[i] = difference[i] + 0.5;
			all = all + (int)(difference[i] / differenceMod[i] + 0.5);
			System.out.println(all);
			i++;
		}
		int ans = 5 - all;
		System.out.println("Total number of invalid digits:" + ans);
	}
}

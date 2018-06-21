import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dice_Main {

	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter sides");
		int sides = Integer.parseInt(inp.readLine());

		if (sides == 2 || sides == 4 || sides == 6) {
			Dice_Program d = new Dice_Program();
		int result = d.roll(sides);
			
			System.out.println(result);

		} else {
			System.out.println("Invalid Input");
		}

	}
}
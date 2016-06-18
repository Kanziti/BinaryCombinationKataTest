import java.util.Scanner;
import java.util.regex.Pattern;

public class BinaryCombinationTest {

	// Define RegEx pattern to check the binary combination
	static Pattern pn = Pattern.compile("(1{2,})");

	public static void main(String[] args) {
		//create the console scanner line
		Scanner sc = new Scanner(System.in);
		int ndigit = 0;

		System.out.println("Please enter the number of bits (Int): ");

		// Wait for input the number of digits
		while(!sc.hasNextInt()){
			System.out.println("int, please!: ");
			sc.nextLine();
		}
		ndigit=sc.nextInt();
		sc.close();
		// create BinaryCombination object 
		BinaryCombination bc = new BinaryCombination();
		// set BinaryCombination's number of digit (bits)
		bc.setNbrDigit(ndigit);

		//Recursive call to generate the binary combination string.
		bc.generateBinaryCombination("", bc.getNbrDigit(), pn); 
		//Show the number of combinations
		System.out.println("Number of combinations meet the criteria : "
				+bc.getnbrBinaryConform());

	}

}

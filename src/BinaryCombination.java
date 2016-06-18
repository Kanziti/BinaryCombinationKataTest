import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class BinaryCombination {

	private int nbrDigit; // number of bits
	private int nbrBinaryConform = 0; // number of combination conform to the criteria

	public void generateBinaryCombination(String gbin, int nbrDigit, Pattern pn) {

		if (nbrDigit==0){ // Check if the iteration limit is reached 
			
			// Create the matcher object
			Matcher m = pn.matcher(gbin);

			// Check the matching to the pattern defined
			if (!m.find()){
				// Increase nbrBinaryConform counter
				this.nbrBinaryConform++;
				// Show the combination
				System.out.println(gbin);
			}

		}else{
			//Recursive calls with decreasing the iterations
			generateBinaryCombination(gbin+"0", nbrDigit-1, pn);
			generateBinaryCombination(gbin+"1", nbrDigit-1, pn);

		}
	}

	// Getters and setters

	public int getNbrDigit() {
		return nbrDigit;
	}

	public void setNbrDigit(int nbrDigit) {
		this.nbrDigit = nbrDigit;
	}

	public int getnbrBinaryConform() {
		return nbrBinaryConform;
	}

	public void setnbrBinaryConform(int nbrBinaryConform) {
		this.nbrBinaryConform = nbrBinaryConform;
	}



}

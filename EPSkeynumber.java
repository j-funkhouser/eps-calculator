package elizabethPercentageSystem;
import java.util.Scanner;

public class EPSkeynumber {

	public int calculateKey (){
		Scanner circ = new Scanner(System.in);
		Scanner stit = new Scanner(System.in);
	    System.out.println("Enter the widest measurement of the desired sweater circumference in inches: ");
	    if (!circ.hasNextInt()){
	    	String wrong = circ.next();
	    	System.err.println(wrong + " is not a valid number. The program will now close.");
	    	circ.close();
	    	stit.close();
	    	System.exit(0);
	    	}
	    int circumfrence = circ.nextInt();
	    if (circumfrence < 0){
	    	System.err.println("That number is negative. The program will now close");
	    	circ.close();
	    	stit.close();
	    	System.exit(0);
	    }
	    System.out.println("The circumference entered is: " + circumfrence);
	    System.out.println("Next, input the stitches per inch of your gauge swatch: ");	
	    if (!stit.hasNextInt()){
	    	String evenWronger = stit.next();
	    	System.err.println(evenWronger + " is not a valid number. The program will now close.");
	    	stit.close();
	    	circ.close();
	    	System.exit(0);
	    }
	    int stitchesPerIn = stit.nextInt();
	    if (stitchesPerIn < 0){
	    	System.err.println("That number is negative. The program will now close.");
	    	circ.close();
	    	stit.close();
	    	System.exit(0); 
	    }
		System.out.println("The stitches per inch entered is: " + stitchesPerIn);
		int keyNo = circumfrence * stitchesPerIn;
		System.out.println("The key number is: " + keyNo);
		return keyNo;
		}
			

}

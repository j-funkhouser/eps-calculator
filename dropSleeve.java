/*This calculates the number of stitches needed for the sleeve hole, cuff, and neck of the drop sleeve sweater. 
 * It's straight up and down, with the shoulder "seams" off the shoulders. 
 * @arguments keyNo = key number of stitches, also the number of stitches needed for initial cast on.
 * @variables SLEEVE_PERCENT, CUFF_PERCENT, and NECK_PERCENT: Percentages from Knitting Workshop by Elizabeth Zimmerman.
 * pages 153-154 in my edition.
 *
 *
 */

package elizabethPercentageSystem;

public class dropSleeve {
	
	
	public void getSleeveStitches(int keyNo){  //shows # of stitches needed for sleeve hole
		final double SLEEVE_PERCENT = .5;
		double sleeveStitches = keyNo * SLEEVE_PERCENT; 
		System.out.println("Stitches needed for sleeve hole is: " + Math.round(sleeveStitches));
	}
	
	public void getCuffStitches (int keyNo){  //shows # of st needed for cuffs
		final double CUFF_PERCENT = .2;
		double cuffStitches = keyNo * CUFF_PERCENT ;
		System.out.println("Stitches needed for cuff is: " + Math.round(cuffStitches));
	}
	
	public void getNeckStitches (int keyNo){ //shows # of st needed for neck hole
		final double NECK_PERCENT = .33;
		double neckStitches = keyNo * NECK_PERCENT; 
		System.out.println("Stitches needed for neck hole is: " + Math.round(neckStitches));
	}
	
	public void showKeyNo(int keyNo){ //shows stitches needed for width of body
		System.out.println("You need to cast on " + keyNo + " stitches for the bottom.");
	}
	

}

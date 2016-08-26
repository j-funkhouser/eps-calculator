/* Class for a yoke sweater, basically seamless as instructed by Elizabeth Zimmerman. 
 *  @arguments keyNo: Key number, the number of stitches needed for the body of the sweater
 *  @variables *_PERCENT are from Knitting Workshop by Elizabeth Zimmerman, pgs 153-154
 *  
 */


package elizabethPercentageSystem;

public class Yoke {
	
	public void getBottomStitches(int keyNo){ //Stitches for bottom part, will make optional
		final double BOTTOM_PERCENT = .9;
		double bottomStitches = keyNo * BOTTOM_PERCENT;
		System.out.println("The bottom hem should be " + bottomStitches + " stitches around.");
				
	}
	
	public void getSleeveStitches(int keyNo){ //Stitches for upper arm
		final double SLEEVE_PERCENT = .33;
		double sleeveStitches = keyNo * SLEEVE_PERCENT ;
		System.out.println("The upper arm should be " + Math.round(sleeveStitches) + " stitches around.");
	}
	
	public void getCuffStitches(int keyNo){ //Stitches for cuff
		final double CUFF_PERCENT = .2;
		double cuffStitches = keyNo * CUFF_PERCENT;
		System.out.println("The cuff should be " + Math.round(cuffStitches) + " stitches around.");
	}
	
	public void getNeckStitches(int keyNo){ //Stitches for neck hole
		final double NECK_PERCENT = .45;
		double neckStitches = keyNo * NECK_PERCENT;
		System.out.println("The neck hole should be " + Math.round(neckStitches) + " stitches around.");
	}
	
	public void getShoulderStitches(int keyNo){ //Stitches for shoulder circumference 
		final double SHOULDER_PERCENT = 1.33;   
		double shoulderStitches = keyNo * SHOULDER_PERCENT;
		System.out.println("The shoulder circumference should be " + Math.round(shoulderStitches) + 
				" stitches around.");
	}
	
	public void getArmpitStitches(int keyNo){ //shows armpit stitches for weaving in later
		final double ARMPIT_PERCENT = .08;
		double armpitStitches = keyNo * ARMPIT_PERCENT;
		System.out.println("The stitches needed for weaving in the underarm stitches will be " + 
				Math.round(armpitStitches) + " stitches around.");
	}
	
	public void showKeyNo(int keyNo){ //shows stitches needed for width of body
		System.out.println("You need to cast on " + keyNo + " stitches for the bottom.");
	}
	
	

}

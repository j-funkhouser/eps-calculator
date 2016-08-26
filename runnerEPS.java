package elizabethPercentageSystem;

public class runnerEPS {

	public static void main(String[] args) {
		System.out.println("Hello! Welcome to my EPS calculator!");
		EPSkeynumber getKey = new EPSkeynumber(); 
		int keyNo = getKey.calculateKey(); //Key number, used in all methods + classes-
		//put in menu choices when i am not feeling like ass
		//for now, just test methods
		
		dropSleeve dropSweater = new dropSleeve();
		Yoke yokeSweater = new Yoke();
		
		System.out.println("These are the numbers you need for a drop sleeve sweater: \n");
		dropSweater.showKeyNo(keyNo);
		dropSweater.getNeckStitches(keyNo);
		dropSweater.getSleeveStitches(keyNo);
		dropSweater.getCuffStitches(keyNo);
	
		System.out.println("Here are the numbers you'll need for a seamless yoke sweater: \n");
		System.out.println("This number is for a tighter hem for your seamless yoke sweater: \n");
		yokeSweater.getBottomStitches(keyNo);
		System.out.println("Ignore the tighter hem stitches and use your key number for the hem"+
		"\n if you want a looser hem. ");
		yokeSweater.showKeyNo(keyNo);
		yokeSweater.getCuffStitches(keyNo);
		yokeSweater.getSleeveStitches(keyNo);
		yokeSweater.getArmpitStitches(keyNo);
		yokeSweater.getShoulderStitches(keyNo);
		yokeSweater.getNeckStitches(keyNo);
	}
		
}



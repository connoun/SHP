import java.util.*;

public class dicejacking {

	public static final void main(String[] args)
	{
		System.out.println("Press 1 to play dicejacker.");
		Scanner s = new Scanner(System.in);
		int lol = s.nextInt();
		if (lol != 1){
				System.out.println("Alright. Some other time, then.");
				return;}
		else {
			Random die = new Random();
			int[]a = new int[22];
			int n = 0;
			for (int i = 0; i<a.length;i++){
				System.out.println("Press 0 to stop rolling, anything else to continue.");
				int roll = s.nextInt();
				if (roll!=0){
					int pips = die.nextInt(5) + 1;
					a[i] = pips;
					n = n + pips;
					System.out.println(n);}
				else {
					System.out.println("You've chosen to hold. You have " + n + " points.");
					break;
				}
				if (n>21) {
					System.out.println("BUST! Dealer wins!");
					break;
				}
			int[]b = new int[22];
			int m = 0;
					
			}
				
				}
		
	}
}


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
			int n = 0;
			for (int i = 0; i<22;i++){
				System.out.println("Press 0 to stop rolling, anything else to continue.");
				int roll = s.nextInt();
				if (roll!=0){
					int pips = die.nextInt(6) + 1;
					n = n + pips;
					System.out.println(n);}
				else {
					System.out.println("You've chosen to hold. You have " + n + " points.");
					break;
				}
				if (n>21) {
					System.out.println("BUST! Dealer wins!");
					break;
				}}
			int m = 0;
			for (int h = 0; h<22; h++){
				if (n>21){
					break;
				}
				else {
					if (m>17) {
						System.out.println("The dealer has chosen to hold at " + m + ".");
						break;}
					else {
					int pipsism = die.nextInt(6)+1;
					m = m+pipsism;
					System.out.println("Rolling...");
					}
				}
				
			}
			if (n>21) {
				
			}
			else {
				if (m>n){
				System.out.println("Dealer won.");
				}
				else {
					if (m==n){
						System.out.println("Tie!");
					}
					else{
						System.out.println("Player won.");
					}
				}
			}
		}
				
	}
		
	
}


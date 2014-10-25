import java.util.Scanner;
import java.util.Random;

/**
 * The computer generates a random number. We try to guess it. The computer
 * tells us if it's too high/low.  We keep going until they get it right.
 */
public class GuessingGame
{
    public static final void main(String[] args)
    {
        // ask the user for the maximum number
        System.out.print("What is the maximum value? ");
        Scanner scan = new Scanner(System.in);
       
        // read the max value
        int max = scan.nextInt();

        // generate a random number between 0 and max
        Random rand = new Random();
        int value = rand.nextInt(max + 1);

        // ask the user to guess what the number is
        System.out.print("Guess what the number is: ");
        int guess = scan.nextInt();

        // keep looping until guess == value
        	int numbertry = (int)(Math.log(value)/Math.log(2));
        	for(int i=0; i<numbertry; i++)
        	{
        			
                if (guess == value) {
                	System.out.println("Wow, correct!");
                	break;
                }
                if (i==numbertry-1){
                	System.out.println("You lost, you nerd. The number was " + value);
                	
                }
                else {
        	{
        		
        			// too high
        			if (guess > value)
        			{ 
        				System.out.println("Nope, too high.");
        			}
        			if (guess < value)
        			{
        				System.out.println("Nope, too low.");
        			}

        			// ask the user to guess again
        			System.out.print("Guess again: ");
        			guess = scan.nextInt();
        	

        		
            }
        	}
}
        
        	
        }
                
    }


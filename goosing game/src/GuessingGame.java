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
        System.out.println("What is the maximum value?");
        System.out.println("Note that the higher you set this, the more guesses you will get. ");
        Scanner scan = new Scanner(System.in);
       
        // read the max value
        int max = scan.nextInt();

        // generate a random number between 0 and max
        Random rand = new Random();
        int value = rand.nextInt(max + 1);

        // ask the user to guess what the number is


        // keep looping until guess == value
        	int numbertry = (int)(Math.log(max)/Math.log(2))+1;
        	System.out.println("You have " + numbertry + " tries.");
            System.out.println("Guess what the number is: ");
            int guess = scan.nextInt();
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


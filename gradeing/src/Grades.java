import java.util.Scanner;

public class Grades
{
    public static final void main(String[] args)
    {
    	System.out.print("How many tests you got? ");
    	Scanner s = new Scanner(System.in);
    	
    	int g = s.nextInt();
    	System.out.println(g + " is a fine number.");
    	
    	int[]a = new int[g];
    	
    	
    	for (int i = 0;i<a.length;i++){
    		System.out.println("What is your grade?");
    		int gr = s.nextInt(); a[i]=gr; 
    		if (g<i){
    			int d = 0 + a[i];
        		System.out.println(d);

    	}
    

    		}
    	}

    }


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
    	int n=0;
    	
    	for (int i=0;i<a.length;i++){
    		int j=s.nextInt();
    		a[i]=j;
    		n=n+j;   		
    		System.out.println(n);
    	}
   
    

    		}
    	}

    


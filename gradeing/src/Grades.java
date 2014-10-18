import java.util.Scanner;

public class Grades
{
    public static final void main(String[] args)
    {
    	System.out.print("How many tests you got? ");
    	Scanner s = new Scanner(System.in);
    	
    	int g = s.nextInt();
    	System.out.println(g + " is a fine number.");
    	System.out.println("Gimme your grades.");
    	int[]a = new int[g];
    	int n=0;
    	
    	for (int i=0;i<a.length;i++){
    		if (i==0){
    		int j=s.nextInt();
    		a[i]=j;
    		n=n+j;}
    		else {
    		System.out.println("Next?");
    		int j=s.nextInt();
    		a[i]=j;
    		n=n+j;}
    	}
    	System.out.println(" ");
    	System.out.println("Your total is " + n);
    	System.out.println("Your average is " + (double)n/g);

    		}
    	}

    


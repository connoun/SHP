import java.util.Scanner;

public class FindMax
{
    public static final void main(String[] args)
    {
    	System.out.println("Number of numbers?");
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int[]a = new int[n];
		int j = 0;
    	for (int i=0;i<a.length;i++){
    		System.out.println("Next number?");
    		int scanin = s.nextInt();
    		if(scanin>j){
    			j=scanin;
    			}
    		System.out.println(j);
    		}
    	}
    }
    


import java.util.Scanner;

public class FindMax
{
    public static final void main(String[] args)
    {
    	System.out.println("Number of numbers?");
    	Scanner s = new Scanner(System.in);
    	int n = s.nextInt();
    	int[]a = new int[n];
    	for (int i=0;i<a.length;i++){
    		if (i==0){
    			System.out.println("Gibe number pls");
    			int j = s.nextInt();
    			a[i]=j;
    			}
    		else {
    			System.out.println("Gibe number pls");
    			int j = s.nextInt();
    			a[i]=j;
    			if (a[i]>a[i-1]){
    				System.out.println("Wow max noomber");
    			}
    			}
    		}
    	}
    }
    


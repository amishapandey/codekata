import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int c=0,r;
	    while(n!=0){
	        r=n/10;
	        c++;
	        n=r;
	    }
	    System.out.println(c);
	    
	
	}
}

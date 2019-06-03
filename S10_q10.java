import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int rem,prod=1;
	    while(n>0){
	        rem=n%10;
	        prod=prod*rem;
	        n=n/10;
	    }
		System.out.print(prod);
	}
}

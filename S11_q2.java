import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int rem;
	    if(n%2==0){
	    while(n%2==0){
	        rem=n/2;
	        if(rem%2==0)
	        n=rem;
	        else
	        {
	        n=rem;
	        System.out.println(rem);
	        }
	    }
	    }
	  else
		System.out.println(n);
	}
}

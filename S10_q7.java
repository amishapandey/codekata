import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int rem;
	    while(n>0){
	        rem=n%10;
	        System.out.print(rem);
	        n=n/10;
	    }
	}
}

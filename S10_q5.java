import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int l=sc.nextInt();
	    int m=sc.nextInt();
		System.out.printf("%.0f",Math.floor((l*m*n)/100));
	}
}

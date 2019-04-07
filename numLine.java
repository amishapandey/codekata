import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int j,n=0;
	    for(j=0;j<s.length();j++){
	        if(s.charAt(j)=='.')
	        n=n+1;
	    }
	    if(n==1)
	    System.out.println(n);
	    else
	    System.out.println(n+1);
	}
}

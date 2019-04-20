import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a=0,b=0,c=1,i;
	    for(i=1;i<=n;i++){
	      a=b;
	      b=c;
	      c=a+b;
	      System.out.print(a);
	      System.out.print(' ');
	  } 
}
}

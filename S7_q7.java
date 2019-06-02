import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int rem=0;
	  if(n<=10)
	  {
	      rem=n/10;
	      System.out.println((rem+1)*10);
	  }
	  else{
	      while(n>10){
	      rem=n/10;
	      n=n%10;
	      }
	     System.out.println((rem+1)*10);
	  }


	}
}

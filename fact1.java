import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int i,fact=1;
	    if(n==0)
	    System.out.println(fact);
	    else if(n==1)
	    System.out.println(fact);
	    else{
	    for(i=1;i<=n;i++){
		fact=fact*i;
	    }System.out.println(fact);
	    }
	 }
}

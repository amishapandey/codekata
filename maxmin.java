import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] a=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    int max=0,min=0,i;
	   for(i=0;i<n;i++){
	       if(a[i]>max)
	       max=a[i];
	       else
	       max=max;
	   }
	    System.out.println(max);
	    for(i=0;i<n;i++){
	       if(a[i]<min)
	       min=a[i];
	       else
	       min=min;
	   }
	    System.out.println(min);
	    
	
	}
}

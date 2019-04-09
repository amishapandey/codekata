import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int i;
	    char[] a=str.toCharArray();
	    for(i=0;i<=a.length;i=i+2)
	    {
	        a[i]=a[i]^a[i+1];
	        a[i+1]=a[i]^a[i+1];
	        a[i]=a[i]^a[i+1];
	   }
	   for(i=1;i<=a.length;i=i+2){
	      a[i]=a[i]^a[i+1];
	        a[i+1]=a[i]^a[i+1];
	        a[i]=a[i]^a[i+1];
	   }
	   for(i=0;i<a.length;i++)
	   {
	       System.out.print(arr[i]);
	   }
	 }
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int i;
	    for(i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	    }
	   for(i=0;i<arr.length;i++){
	       if(arr[i+1]!=arr[i]+1)
	       break;
	   }
	    
	        System.out.print(i+1);

	  
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    int i;
	    for(i=0;i<n;i++){
	    arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    int l=arr.length;
	    System.out.print(l);
	    for(i=l-1;i>=0;i--)
	    {
		System.out.print(arr[i]);
	    }
	}
}
	

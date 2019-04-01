import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int i;
	    int n=sc.nextInt();
	    int arr[]=new int[n];
	    for(i=0;i<n;i++){
	        arr[i]=sc.nextInt();
	    }
	    for(i=0;i<n;i++){
	        System.out.print(arr[i]+" ");
	        System.out.println(i);
	    }
	}
	

}

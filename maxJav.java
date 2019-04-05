import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the element of the array");
		int i;
		int[] arr=new int[10];
	    for(i=0;i<10;i++){
	        arr[i]=sc.nextInt();
	    }
		int m=0;
		for(i=0;i<10;i++){
		    if(arr[i]>m)
		    m=arr[i];
		    else 
		    m=m;
		}
		System.out.println(m);
	}

}

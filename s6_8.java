import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int arr[]=new int[n];
	    int i,count=0;
	    for(i=0;i<arr.length;i++){
	        arr[i]=sc.nextInt();
	    }
	    Arrays.sort(arr);
	    for(i=0;i<arr.length;i++){
	       if(arr[i]==m)
	       count+=1;
	       
	       else
	       continue;
	    }if(count>=1)
		System.out.println("yes");
		else
		System.out.println("no");
		
	}
}

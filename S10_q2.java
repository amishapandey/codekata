import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int l=sc.nextInt();
	    int arr[]=new int[l];
	    int sum=0;
	    for(int i=0;i<l;i++)
	    arr[i]=sc.nextInt();
	    for(int i=0;i<l;i++)
	    sum=sum+arr[i];
	    System.out.print(sum);
	}
}

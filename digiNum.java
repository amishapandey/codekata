import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int r,count=0;
	    while(n!=0){
	        r=n%10;
	        count+=1;
	        n=n/10;
	    }System.out.println(count);
	}
}

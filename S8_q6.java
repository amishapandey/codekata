import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	    int i,j,count=0;;
	    for(i=1;i<=n/2;i++){
	            if(n%i==0)
	            count+=1;
	        }if(count>2)
	        System.out.println("yes");
	        else
	        System.out.println("no");
	        }
	    }


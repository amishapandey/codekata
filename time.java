import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int i;
	    int n=sc.nextInt();
	    int hr,min;
	   hr=n/60;
	   min=n%60;
	   System.out.print(hr+" ");
	   System.out.println(min);
	    }
	
}

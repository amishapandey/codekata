import java.util.*;
public class Solution
{
	public static void main(String[] args) {
	    Scanner d=new Scanner(System.in);
	    String str=d.nextLine();
	    char [] h=str.toCharArray();
	    int i;
	    for(i=h.length-1;i>=0;i--)
		System.out.print(h[i]);
	}
}

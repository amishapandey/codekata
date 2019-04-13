import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    String str=sc.nextLine();
	    char [] ch=str.toCharArray();
	    String a="";
	    int r=ch.length;
	    for(int i=0;i<r;i++)
	    {
	        a+=ch[i];
	    }
		System.out.print(a+'.');
	}
}

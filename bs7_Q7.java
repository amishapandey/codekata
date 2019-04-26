import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char [] ch=s.toCharArray();
	    int i,bin=0;
	    for(i=0;i<ch.length;i++)
	    {
	        if(ch[i]=='0' || ch[i]=='1')
	        {
	        bin+=1;
	        }
	        
	    }
	    if(bin==0)
	    System.out.println("no");
	    else
	    System.out.println("yes");
	}
}

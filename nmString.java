import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner (System.in);
	    String s=sc.nextLine();
	    int i,c=0;
	    for(i=0;i<s.length();i++)
	   
	    {
	        if(s.charAt(i)!='')
	        c++;
	        
	    }
	    
		System.out.println(c);
	}
}

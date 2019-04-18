import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    String s2=sc.nextLine();
	   char ch1[]=s1.toCharArray();
	   char ch2[]=s2.toCharArray();
	    int i,j,count=0;
	   
	    
	    for(i=0;i<ch1.length;i++)
	    {
	        if(ch1[i]!=ch2[i])
	            count+=1;
	    }
	    
	   
	    if(count==1)
		System.out.println("yes");
		else
			System.out.println("no");
	}
}

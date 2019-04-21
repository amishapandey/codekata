import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char []ch=s.toCharArray();
	    int i,f=0;
	    for(i=0;i<ch.length;i++)
	    {
	        if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u')
	        f+=1;
	        else
	        continue;
	        
	    }
	        if(f>=1)
		System.out.println("yes");
		else
		System.out.println("no");
	}
}

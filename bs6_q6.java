import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char ch []=s.toCharArray();
	    int i,j,count=0;
	    for(i=0;i<ch.length;i++)
	    {
	        if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
	        {
	        for(j=i+1;j<ch.length;i++){
	            if(ch[j]>=0 && ch[j]<=9)
	            count+=1;
	        }
	        }
	        else
	        {
	            if(ch[i]>=0 && ch[i]<=9)
	            {
	                for(j=i+1;j<ch.length;i++)
	                {
	              if(ch[j]>='a' && ch[j]<='z' || ch[j]>='A' && ch[j]<='Z')
	                  count+=1;
	                    
	                }
	            
	        }
	        }
	        }if(count>=1)
	        System.out.println("yes");
	        else
	        System.out.println("no");
	  }
	    }
	    
	        

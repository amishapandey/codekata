import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    char [] ch=s1.toCharArray();
	    int l=ch.length;
	    int i;
	    ch[0]=(char)(ch[0]-32);
	   
	    for(i=0;i<=l-1;i++)
	        {
	           if(ch[i]==' '){
	               if(ch[i]>='A' && ch[i]<='Z')
	               ch[i]=ch[i];
	               else
	               ch[i+1]=(char)(ch[i+1]-32);
	           }
	        }
	       for(i=0;i<l;i++){
	            System.out.print(ch[i]);
	            
	       }
	}
}

	    

	               
	           

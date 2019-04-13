import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.nextLine();
	    char [] ch=s1.toCharArray();
	    int l=ch.length;
	    int i;
	    for(i=0;i<=l/2;i++)
	        {
	           char temp;
	           temp=ch[2*i];
	           ch[2*i]=ch[2*i+1];
	           ch[2*i+1]=temp;
	        }
	       for(i=0;i<l;i++){
	            System.out.print(ch[i]);
	            
	       }
	}
}

	    

	               
	           

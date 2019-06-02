import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    String s1="";
	    String s2="";
	    char ch[]=s.toCharArray();
	    int i;
	    for(i=0;i<ch.length;i++){
	    if(i%2==0)
	    s1+=ch[i];
	    else
	    s2+=ch[i];
	    }
	      System.out.print(s1+" ");
	      System.out.print(s2);
	  
	  
}
}

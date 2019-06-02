import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char ch[]=s.toCharArray();
	    int i;
	    for(i=0;i<ch.length;i++){
	    if(ch[i]>='0' && ch[i]<='9')
	      System.out.print(ch[i]);
	  }
	  
}
}

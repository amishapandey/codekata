import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char ch[]=s.toCharArray();
	    int i;
	    for(i=0;i<ch.length;i++){
	   if(i==0 ||ch[i-1]==' ')
	    ch[i]=Character.toUpperCase(ch[i]);
	    }
	    for(i=0;i<ch.length;i++)
	    System.out.print(ch[i]);
	}
}

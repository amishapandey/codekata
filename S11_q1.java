import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    int n=sc.nextInt();
	    char ch[]=s.toCharArray();
	    int i;
	    for(i=ch.length-n;i<ch.length;i++)
	    System.out.print(ch[i]);
	    }
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int n=str.length();
	    char [] ch= new char[n+1];
	    ch=str.toCharArray();
	    int i;
	    for(i=0;i<ch.length;i++){
		System.out.println(ch[i]);
	    }
	}
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int i,count=0;
	    for(i=0;i<str.length();i++){
	        if(str.charAt(i)==' ')
	        count+=1;
	    }
		System.out.println(count);
	}
}

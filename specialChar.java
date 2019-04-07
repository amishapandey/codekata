import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int i,count=0;
	    for(i=0;i<str.length();i++){
	       if(str.charAt(i)>'a' && str.charAt(i)<'z' || str.charAt(i)>'A' && str.charAt(i)<'Z' || (str.charAt(i)>='0' && str.charAt(i)<='9') )
	       continue;
	    else
	    count+=1;
	    }
		System.out.println(count);
	}
}

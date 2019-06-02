import java.util.*;
public class Main
{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	     int i;
	     String str=sc.nextLine();	    
         char ch[]=str.toCharArray();
         Arrays.sort(ch);
         System.out.println(ch);
    }
}

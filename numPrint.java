import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
         String n=input.nextLine();
         char [] ch=n.toCharArray();
         int i;
         for(i=0;i<ch.length;i++)
         {
		System.out.print(ch[i]);
		System.out.print(' ');
         }
		
	}
}

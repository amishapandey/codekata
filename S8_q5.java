import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   char ch[]=s.toCharArray();
	    int i;
	    if(ch.length%2!=0)
	    for(i=0;i<ch.length;i++){
	            if(i==ch.length/2)
	            System.out.print("*");
	            else
	            System.out.print(ch[i]);
	          }
	          else{
	              for(i=0;i<ch.length;i++){
	            if(i==(ch.length/2)-1|| i==ch.length/2 )
	            System.out.print("*");
	            else
	            System.out.print(ch[i]);
	          }
	          }       
   }
}

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String n=sc.nextLine();
	    char ch[]=n.toCharArray();
	    int i,j,count=0;;
	    for(i=0;i<ch.length;i++){
	            if(ch[i]%2!=0)
	            System.out.print(ch[i]+" ");
	          
	    }
}
}

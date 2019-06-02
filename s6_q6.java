import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.nextLine();
	    char ch[]=s.toCharArray();
	    int i,a=0,n=0,sp=0;
	    for(i=0;i<ch.length;i++){
	        if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z' )
	        a+=1;
	        else if(ch[i]>='0' && ch[i]<='9')
	        n+=1;
	        else
	        sp+=1;
	        }
	        if(a>0 && n>0){
		System.out.println("Yes");
	        }
		else
		System.out.println("No");
	}
}

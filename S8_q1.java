import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   String s=sc.nextLine();
	   char ch[]=s.toCharArray();
	    int i,j=ch.length-1,count=0;
	  for(i=0;i<ch.length;i++){
	    if(i<j)
	      {
	            if(ch[i]!=ch[j]){
	            j--;
	            count+=1;
	            }
	            else{
	                j--;
	            }
	       }
	  }
	          if(count==0)
	          System.out.println("yes");
	          else
	          System.out.println("no");
	  }
}

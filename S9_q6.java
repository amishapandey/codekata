import java.util.*;
public class Main
{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	     int i,c=0;
	     String a=sc.nextLine();	    
        a=a.toLowerCase();
       char ch[]=a.toCharArray();
        Arrays.sort(ch);
  
	     for(i=0;i<ch.length-1;i++){
	     if(ch[i]==ch[i+1])
	     c+=1;
	     }
	     if(c>0)
	      System.out.print("N0");
	      else
	       System.out.print("Yes");
	    
}
}

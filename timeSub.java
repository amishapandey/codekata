import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    int h,m;
	    int h1=sc.nextInt();
	    int m1=sc.nextInt();
	    int h2=sc.nextInt();
	    int m2=sc.nextInt();
	  if (m2>m1)
	  {
	      m=m2-m1;
	  }
	  else
	  {
	      m=m1-m2;
	  }
	   if (h2>h1)
	  {
	      h=h2-h1;
	  }
	  else
	  {
	      h=h1-h2;
	  }
	  
	   System.out.print(h+" ");
	   System.out.println(m);
	    }
	
}

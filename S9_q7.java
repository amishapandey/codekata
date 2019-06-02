import java.util.*;
public class Main
{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	     int i;
	     int num1=sc.nextInt();	    
         int num2=sc.nextInt();
         int nume,deno;
         if(num1>num2){
             nume=num1;
             deno=num2;
         }
         else{
         nume=num2;
         deno=num1;
         }
       int rem=nume%deno;
      while(rem!=0)
      {
          nume=deno;
          deno=rem;
          rem=nume%deno;
      }
          System.out.println(deno);
}
}

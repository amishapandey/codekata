import java.util.*;
public class Main
{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
	     int i;
	     int nu1=sc.nextInt();	    
         int nu2=sc.nextInt();
         int num,den;
         if(nu1>nu2){
             num=nu1;
             den=nu2;
         }
         else{
         num=nu2;
         den=nu1;
         }
       int rem=num%den;
      while(rem!=0)
      {
          num=den;
          den=rem;
          rem=num%den;
      }
          System.out.println((nu1*nu2)/den);
}
}

import java.util.*;
class Simple{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first,difference,terms of series");
int f=sc.nextInt();
int diff=sc.nextInt();
int t=sc.nextInt();
int v,sum=0;
v=f;
for(i=0;i<t;i++)
sum+=v;
v=v+diff;
}
System.out.println(sum);
}

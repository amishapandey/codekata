import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,t;
float j;
int a[]=new int[n];
int l=a.length;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
if(a.length%2!=0){
i=(l/2);
System.out.println(a[i]);
}
else {
 j=a.length/2;
 float s=a[j]+a[j-1];
 float t=s/2;
System.out.println(t);
}
}
}

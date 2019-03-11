import java.util.*;
class Simple{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,j,t;
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n-1;i++)
{
int flag=0;
for(j=0;j<n-1-i;j++)
{
if(a[j]>a[j+1])
{
t=a[j];
a[j]=a[j+1];
a[j+1]=t;
flag=1;
}
}
if(flag==0)
{
break;
}
}
if(a.length()%2!=0){
int l=a.lenght();
int med=(l/2)+1;
System.out.println(a[med]);
}
else
{
int l=a.lenght();
int med=(a[l]+a[l+1])/2;
System.out.println(med);
}
}
}


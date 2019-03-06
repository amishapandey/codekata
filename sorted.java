import java.util.*;
class Simple{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
  int i,j,temp;
for(i=0;i<n;i++){
a[i]=sc.nextInt();
}
for(i=0;i<n-1;i++)
{
  int flag=0;
  for(j=0;j<n-1-i;j++){
    if(a[j+1]<a[j])
    {
      temp=a[j];
      a[j]=a[j+1];
      a[j+1]=temp;
      flag=1;
  }
  }

  if(flag==0)
  {
    break;
  }
}
  for(i=0;i<n;i++)
  {
    System.out.print(a[i]+" ");
  }
}
}
  
      

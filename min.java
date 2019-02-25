import java.util.*;
class Simple{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,min=0;
int ar[]=new int[n];
for(i=0;i<n;i++){
ar[i]=sc.nextInt();
}
for(i=0;i<n;i++){
if(min>ar[i]){
min=ar[i];
}
else
min=min;
}
System.out.println(min);
}
}




import java.util.Scanner;
class solution
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String s=s.nextLine();
char[] ch=s.toCharArray();
int len=ch.length;
  if (ch[0]>='a' && ch[0]<='z')
  {
    ch[0]=(char)(ch[0]-'a'+'A');
  }
      
for (int i=0;i<=len-1;i++)
{
if (ch[i]==' ')
{
i++;
if (ch[i]>='a' && ch[i]<='z')
{
ch[i]=(char)(ch[i]-'a'+'A');
}
}
}
System.out.println(ch);
}}

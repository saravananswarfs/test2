import java.util.Scanner;
class valmonth
{
public static void main(String arg[])
{
Scanner dd=new Scanner(System.in);
System.out.printf("please the month number....");
int mon=dd.nextInt();
String re=(mon>0&&mon<=12)?" THE ENTERED MONTH NUMBER IS VALID":"THE ENTERED MONTH NUMBER IS INVALID";
System.out.println(re);
}}

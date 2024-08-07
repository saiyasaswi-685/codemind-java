import java.util.Scanner;
public class circle
{
public static void main(String args[])
{
     int r;
   double area,peri;
     Scanner sc= new Scanner(System.in);
     r=sc.nextInt();
      area= 3.14*r*r;
       peri = 2*3.14*r;
      System.out.printf("%.2f
",area);
     System.out.printf("%.2f",peri);
     
}
}
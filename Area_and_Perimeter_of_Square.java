import java.util.Scanner;
 public class square
{
    public static void main(String args[])
    {   int a,area,peri;
        Scanner sc= new Scanner(System.in);
       a=sc.nextInt();
       area=a*a;
       peri=4*a;
       System.out.printf("%d ",area);
       System.out.printf("%d ",peri);
       
       
       
    }
}
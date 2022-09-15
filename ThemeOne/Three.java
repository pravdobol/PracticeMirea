package ThemeOne;
import java.util.Scanner;
public class Three
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int [] mas1 = new int[10];
        int sum=0;
        int sa=0;
        for (int i=0;i< mas1.length;i++)
        {
            mas1[i]=sc.nextInt();
        }
        for (int i=0;i< mas1.length;i++)
        {
            sum += mas1[i];
        }
        sa=sum/ mas1.length;
        System.out.println("сумма элементов массива:"+ sum);
        System.out.print("среднее арифметическое всех элементов массива:"+ sa);
    }
}
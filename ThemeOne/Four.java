package ThemeOne;
import java.util.Scanner;
public class Four
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
        int k=0;
        while(k<mas1.length)
        {
            sum+=mas1[k];
            k++;
        }
        int min=mas1[1];
        int max=mas1[1];
        for(int i=0;i<mas1.length;i++)
        {
            if (mas1[i]>max)
                max=mas1[i];

            if (mas1[i]<min)
                min=mas1[i];
        }

        System.out.println("сумма элементов массива:"+ sum);
        System.out.println("минимальный элемент:"+ min);
        System.out.println("максимальный элемент:"+ max);

    }
}
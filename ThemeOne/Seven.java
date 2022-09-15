package ThemeOne;

import java.util.Scanner;

public class Seven {
    public static int fact(int a)
    {
        int sum=1;
        for (int i=a;i>1;i--)
        {
            sum*=i;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int b= sc.nextInt();
        int res=fact(b);
        System.out.println(res);
    }
}

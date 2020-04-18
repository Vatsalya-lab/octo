import java.util.Scanner;


public class whilo {

    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // int temp = n ;
        // int sum = 0 ;

        // while(temp>0)
        // {
        //     int num = temp%10 ;
        //     temp = temp/10 ;
        //     sum = sum +num;

        // }
        // System.out.println("Sum is :"+ sum  );

                //Palindrome

                int n= sc.nextInt();
                int temp = n ;
                int reverse = 0;

                while(temp>0)
                {
                    int last = temp%10 ;
                    reverse = reverse*10 + last;
                    temp /= 10;

                }
                if(reverse == n)
                {
                    System.out.println(n+"is palindrome");
                }
                else
                {
                    System.out.println(n+ "is not a palindrome");

                }




         sc.close();



    }

}
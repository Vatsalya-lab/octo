import java.util.Scanner;

public class forloop {
    public static void main(String[] args)
    {
            // for(long i =0 ; i<100 ; i++)
            // {
            //     System.out.println("Modiji " + i);
            // }

            // int sum = 0 ;
            // for(int i = 0 ; i<6 ; i++ )
            //         {
            //             sum = sum + i ;
                           


            //         }
            //         System.out.println("Sum is :" + sum);

                    //Factorial

                    Scanner sc = new Scanner(System.in);

                    int n = sc.nextInt();
                    int num = 1 ;
                    
                    for(int i = n ; i>=1 ; i--)
                    {
                            num = num*i;

                    }

                    System.out.println(num);
                    sc.close();


    }

}
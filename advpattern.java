import java.util.Scanner;

public class advpattern {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt();

        // for(int j=1 ; j<=n ; j++)
        // {
        //     for(int i = 1 ; i<=n-j ; i++)
        //     {
        //         System.out.print(" ");
        //     }
        //     for(int k = 1 ; k<=j ; k++)
        //     {
        //         System.out.print("*");
        //     } 

        //     System.out.println();
        // }

       // int a = sc.nextInt();

        // for(int i =0 ; i <= a ; i++)

        // {
        //     for(int j = 0 ; j<=a-i ; j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int k = 0 ; k<= i ; k++)
        //     {
        //         System.out.print("*  ");
        //     }
        //         System.out.println();
            
        // }

        //     int num =1 ;    
        // for(int i =0 ; i <= a ; i++)

        // {
        //     for(int j = 0 ; j<=a-i ; j++)
        //     {
        //         System.out.print("  ");
        //     }
        //     for(int k = 0 ; k< i ; k++)
        //     {
        //         System.out.print(num +"  ");
        //         num++ ;
        //     }
        //         System.out.println();
            
        // }

        // int q = sc.nextInt();

        // int result = 2*q-1 ;

        // for(int i = 1 ; i<= result ; i++)
        // {
        //     if(i<=q)
        //     {
        //         for(int j = 1 ; j<=i ; j++)
        //         {
        //             System.out.print("* ");
        //         }

        //     }
        //     else
        //     {
        //         for(int k = 1; k<=result-i+1 ; k++)
        //         {
        //             System.out.print("* ");
        //         }

        //     }
        //         System.out.println();


        // }

        int n = sc.nextInt();

        System.out.println("*");

        for(int j =2 ; j<=n-1 ; j++)
        {
            System.out.print("*");
        
        
            for(int k= 0 ; k<=j-2 ;k++)
            {
                System.out.print("  ");
            }
            
            System.out.print("*");

            System.out.println();
        }
        
       if(n>1)
                {
                    for(int i =0 ; i<=n ; i++)
                    {
                        System.out.print("* ");
                    }
                }

        sc.close();

    }


}
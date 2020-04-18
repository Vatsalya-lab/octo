import java.util.Scanner ;

public class Pattern {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // int n = sc.nextInt(); ;

        // for(int j = 0 ; j<=20 ; j++)
        // {
        // for(int i = 0 ; i <=n ; i++)
        // {
        //     System.out.print(" x ");
        // }
        // System.out.println();


        int n = sc.nextInt();

        for(int j =1 ; j<=n ; j++)
    {
        for(int i =1 ; i<=-(j-4) ; i++)
        {
            System.out.print("  ");

        }
        for(int k = j ; k<=n ; k++)
        {
            System.out.print("*");
        }
        System.out.println();
    }





        sc.close();
    }


    }


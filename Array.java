import java.util.Scanner;


public class Array {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // int age[] ={1 , 2 ,3 ,4 , 5};

        // for(int i =0 ; i<=age.length ;i++)
        // {
        //     System.out.print(age[i]+" ");
        // }

        System.out.println("Enter number of students :");
        int n = sc.nextInt();
       


        int marks[] = new int[n] ;
        System.out.println("Enter Marks:");

        for(int i =0 ; i<n ; i++)
        {
            marks[i] = sc.nextInt();

        }

        float avg = 0 ;
        float sum = 0;

        for(int i =0 ; i<n ; i++)
        {
            avg = avg+marks[i] ;

        }
        sum = avg/n;

        System.out.println("Average is :"+ sum);
        sc.close();

    }
}
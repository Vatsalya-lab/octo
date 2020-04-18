import java.util.Scanner ;


public class conditional {

    public static void main(String[] args) 
    {
       Scanner sc = new Scanner(System.in) ;
        

        System.out.println("Enter age");
            int a = sc.nextInt();

            if(a >= 18)
            {
                    System.out.println("You are eligible to vote");

            }
            else{
                System.out.println("You are not eligible to vote");

            }



        sc.close();


    }

}
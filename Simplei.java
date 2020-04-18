import java.util.Scanner;

public class Simplei 
{

    public static void main(String[] args)
    {
            Scanner sc = new Scanner(System.in);

            float Principal = sc.nextFloat();

            int time = sc.nextInt();

            float Intrest = sc.nextFloat();

            double  SimpleIntrest ;

            SimpleIntrest = Principal*time*Intrest/100 ;
            
            System.out.println(SimpleIntrest);

            sc.close();




    }


}
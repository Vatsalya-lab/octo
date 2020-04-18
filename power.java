import java.util.Scanner;


public class power {
                        //Square on any number

            public static void main(String[] args)
            {
                 Scanner sc = new Scanner(System.in);

                // int a = sc.nextInt();
                // int b = sc.nextInt(); 
                // int result = 1;

                // for(int i = 0 ; i<b ; i++)
                // {
                //     result *=  a;



                // }
                // System.out.println(result);

                //PrimeN

                int num = sc.nextInt();

                    boolean isPrime = true ;

                for(int i = 2 ; i<num ; i++)
                {
                        if(num%i == 0)
                        {
                            isPrime = false;
                                break;
                        }



                }

                
                if(num<2)
                    {
                         isPrime = false ;
                    }
                    System.out.println("is Prime :"+isPrime);
                
                
                
                
                
                
                sc.close();

            }


}
import java.util.Scanner; 

public class calculator
{
            public static void main(String[] args)
            {
                Scanner sc = new Scanner(System.in);

                float result = 0 ;
                 

                System.out.println("Enter First number :");
                int a = sc.nextInt();

                System.out.println("Enter Second number :");
                int b = sc.nextInt();

                System.out.println("Enter operator :");
                sc.nextLine();

                String t = sc.nextLine();
                
                switch(t){

                        case "+" :
                        result = a+b ;
                        break;

                        case "/" :
                        result = a/b ;
                        break;
                        
                        case "-" :
                        result = a-b ;
                        break ;

                        case "*" :
                        result = a*b ;
                        break;

                        default :

                        System.out.println("Invalid input");





                }

                    System.out.println(result);



                sc.close();

            }







}
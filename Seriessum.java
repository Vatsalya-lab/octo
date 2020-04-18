import java.util.Scanner ;


public class Seriessum {

        public static void main(String[] args)
    {   
                Scanner sc = new Scanner(System.in);

                // float a = sc.nextFloat();
                // float result = 0;

                // for(float i = 1 ; i<a ; i++)
                // {
                //     result = result + 1/i ;

                // }
                //     System.out.println(result);


                float num = sc.nextFloat();
                float result = 0 ;

                for(float i = 1 ; i<num ; i++)
                        {

                            if(i%2==0)
                            {
                                result = result-1/i ;
                            }
                            else 
                            {
                                result = result + 1/i ;

                            }

                        }

                                    System.out.println(result);
                            sc.close();
    }


}
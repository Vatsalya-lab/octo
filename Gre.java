
public class Gre {

    public static void main(String[] args)
    {
        //GREATEST NUMBER 
        int a = 100 , b = 27 , c = 21 ;
        int result = 0 ;

        if(a>b)
        {
            if(a>c)
            {
                result = a ;
            }
            else
            {
                result = c;
            }
            


        }
        else
        {
                if(b>c)
                {
                        result = b;

                }
                else
                {

                    result = c ;
                }


        }


            System.out.println(result);


    }

}
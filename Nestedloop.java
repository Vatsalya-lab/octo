
public class Nestedloop {

    public static void main(String[] args)
    {
        int N = 20 ;
        int result = 1 ;

        for(int j = 1  ; j<=11 ; j++){
        for(int i = 1 ; i<=N ; i++)
        {
            result = j *i ;
            System.out.print(result +" ");


        }
        System.out.println();
    }




    }


}
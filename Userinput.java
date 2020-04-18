import java.util.Scanner ;


public class Userinput {

    public static void main( String[] args) {
         Scanner sc = new Scanner(System.in);

         int x = sc.nextInt();

         float y = sc.nextFloat();

        System.out.println(x);
        System.out.println(y);

        // for character
       
         String t = sc.nextLine();
         
            System.out.println(t);

        sc.close(); 

    }      

}
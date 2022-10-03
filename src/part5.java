import java.io.Console;
import java.util.Arrays;
import java.util.Scanner;

public class part5 {

    public static void main(String[] args) {

        //41
        System.out.println();
        System.out.println("41.print ascii value of given char");
        System.out.println();
        System.out.println("Enter a char");
        Scanner input41 = new Scanner(System.in);
        char char41 = input41.next().charAt(0);
        int intChr = char41;
        System.out.println("The ASCII value of "+ char41 + " is: "+ intChr);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //42
        /*System.out.println();
        System.out.println("42.input and display a password");
        System.out.println();

        Console cons;
        if ((cons = System.console()) != null){
            char[] password = null;
            try {
                password = cons.readPassword("Input your password: ");
                System.out.println("Your password is: "+ new String(password));

            }finally {
                if (password != null){
                    Arrays.fill(password, ' ');
                }
            }
        }*/

        //43


    }
}

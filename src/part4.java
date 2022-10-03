import java.nio.charset.Charset;
import java.util.Scanner;

public class part4 {
    //37-40

    public static void main(String[] args) {

        //37
        System.out.println();
        System.out.println("37.reverse a string");
        System.out.println();
        Scanner input37 = new Scanner(System.in);
        System.out.println("Enter a string");
        char [] letters37 = input37.nextLine().toCharArray();

        System.out.println("Reverse String: ");
        for (int i = letters37.length - 1; i >= 0; i--){
            System.out.print(letters37[i]);
        }
        System.out.println("\n");
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //38
        System.out.println();
        System.out.println("38.counting different properties of a string");
        System.out.println();
        Scanner input38 = new Scanner(System.in);
        System.out.println("Enter a string");
        String string38 = input38.nextLine();
        count38(string38);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //39
        System.out.println();
        System.out.println("39.create and display unique 3 digits w/ 1,2,3,4; count how many 3 digit numbers are there");
        System.out.println();
        int amount39 = 0;
        for (int i = 1; i <= 4; i++){
            for (int j = 1; j <= 4; j++){
                for (int k = 1; k <= 4; k++){
                    if (k != i && k != j && i != j){
                        amount39++;
                        System.out.println(i +" "+ j +" "+ k);
                    }
                }
            }
        }
        System.out.println("Total number of 3 digit numbers are: "+ amount39);
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //40
        System.out.println();
        System.out.println("40.list available character sets in charset objects");
        System.out.println();
        System.out.println("List of available character sets: ");
        for (String str : Charset.availableCharsets().keySet()){
            System.out.println(str);
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


    }
    //38
    public static void count38(String string38){
        char[] character = string38.toCharArray();
        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < string38.length(); i++){
            if (Character.isLetter(character[i])){
                letter++;
            } else if (Character.isDigit(character[i])) {
                num++;
            } else if (Character.isSpaceChar(character[i])) {
                space++;
            } else {
                other++;
            }
        }
        System.out.println("The string is: "+ character);
        System.out.println("Number of letters: "+ letter);
        System.out.println("Number of numbers: "+ num);
        System.out.println("Number of spaces: "+ space);
        System.out.println("Number of others: "+ other);
    }
}

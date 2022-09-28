import java.util.Scanner;

public class part3 {

    public static void main(String[] args) {
        //33
        System.out.println();
        System.out.println("33.compute sum of digits");
        System.out.println();
        Scanner input33 = new Scanner(System.in);
        System.out.println("Input a number");
        int num33 = input33.nextInt();
        System.out.println("The sum is: "+ sumDigits33(num33));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        //34
        System.out.println();
        System.out.println("34.area of hexegon");
        System.out.println();
        Scanner input34 = new Scanner(System.in);
        System.out.println("Enter the length of one side");
        double num34 = input34.nextDouble();
        System.out.println("The area of the hexagon is: "+ areaHexagon34(num34));
    }


    //33
    public static int sumDigits33(int num33){
        int sum = 0;
        while (num33 != 0){
            sum += num33 % 10;  //x+=y is same as x=x+y
            num33 /= 10;        //x/=y is same as x=x/y
        }
        return sum;
    }

    //34
    public static double areaHexagon34 (double num34){
        double area = (6*(num34*num34))/(4*Math.PI/6);
        return area;

    }
}

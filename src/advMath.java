import java.util.Scanner;

public class advMath {
    //33-36

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
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


        //35
        System.out.println();
        System.out.println("35.area of a polygon");
        System.out.println();
        Scanner input35 = new Scanner(System.in);
        System.out.println("Enter the number of sides");
        int sides35 = input35.nextInt();
        System.out.println("Enter the length of one side");
        double length35 = input35.nextDouble();
        System.out.println("The area of the polygon is: "+ areaPolygon35(sides35, length35));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

        //36
        System.out.println();
        System.out.println("36.distance between 2 points");
        System.out.println();
        Scanner input36 = new Scanner(System.in);
        System.out.println("Enter Latitude of coordinate 1");
        double latOne36 = input36.nextDouble();
        System.out.println("Enter Longitude of coordinate 1");
        double longOne36 = input36.nextDouble();
        System.out.println("Enter Latitude of coordinate 2");
        double latTwo36 = input36.nextDouble();
        System.out.println("Enter Longitude of coordinate 2");
        double longTwo36 = input36.nextDouble();

        System.out.println("The distance between the two points is: "
                + distBetween36(latOne36, longOne36, latTwo36, longTwo36));
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");


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

    //35
    public static double areaPolygon35 (int sides35, double length35){
        double area = (sides35 * (length35 * length35))/(4 * Math.tan(Math.PI/sides35));
        return area;
    }

    //36
    public static double distBetween36 (double latOne36, double longOne36, double latTwo36, double longTwo36){
        //convert to radians ??
        latOne36 = Math.toRadians(latOne36);
        longOne36 = Math.toRadians(longOne36);
        latTwo36 = Math.toRadians(latTwo36);
        longTwo36 = Math.toRadians(longTwo36);

        double earthRadius = 6371.01;
        double distBetween = earthRadius * Math.acos(Math.sin(latOne36) * Math.sin(latTwo36) + Math.cos(latOne36) *
                Math.cos(latTwo36) * Math.cos(longOne36 - longTwo36));
        return distBetween;

    }
}

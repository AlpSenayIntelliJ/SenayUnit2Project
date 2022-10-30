import java.util.Scanner;
public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Welcome!\nEnter coordinate 1: ");
        String coord1 = scan.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coord2 = scan.nextLine();

        int coord1x = Integer.parseInt(coord1.substring(1, coord1.indexOf(",")));
        int coord1y = Integer.parseInt(coord1.substring(coord1.indexOf(", ")+2,coord1.indexOf(")")));
        int coord2x = Integer.parseInt(coord2.substring(1, coord2.indexOf(",")));
        int coord2y = Integer.parseInt(coord2.substring(coord2.indexOf(", ")+2,coord2.indexOf(")")));


    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by anshup on 20/08/15.
 */
public class DiamondWithName {
    public static void main(String args[]){
        int n;
        n=getInput();
        printIsoscelesDiamond(n);
    }
    public static int getInput(){
        System.out.println("Enter n");
        Scanner sn = new Scanner(System.in);
        try {
            return sn.nextInt();
        }catch(InputMismatchException ime){
            System.out.println("Input mismatches. Default n is 5");
            return(5);
        }
    }
    public static void printIsoscelesDiamond(int noOfRows){
        printIsoscelesTriangle(noOfRows);
        System.out.println("Anshu");
        printReverseIsoscelesTriangle(noOfRows);
    }
    public static void printReverseIsoscelesTriangle(int noOfRows){
        for (int i=noOfRows-1;i>=1;i--) {
            printReverseSpaceTriangle(noOfRows-i);
            printHorizontal(2 * i - 1);
            System.out.println();
        }
    }
    public static void printIsoscelesTriangle(int noOfRows){
        for (int i=1;i<=noOfRows && 2*i-1 != 2*noOfRows-1;i++) {
                printSpaceTriangle(noOfRows - i);
                printHorizontal(2 * i - 1);
                System.out.println();
        }
    }
    public static void printSpaceTriangle(int noOfRows){
        for (int i=noOfRows;i>=1;i--) {
            System.out.print(" ");
        }

    }
    public static void printReverseSpaceTriangle(int noOfRows){
        for (int i=1;i<=noOfRows;i++) {
            System.out.print(" ");
        }

    }
    public static void printHorizontal(int noOfColumns){
        for (int i=1;i<=noOfColumns;i++)
            System.out.print("*");
    }
}

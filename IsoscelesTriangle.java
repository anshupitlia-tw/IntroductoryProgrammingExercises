import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by anshup on 20/08/15.
 */
public class IsoscelesTriangle {
    public static void main(String args[]){
        int n;
        n=getInput();
        //printSpaceTriangle(n);
        printIsocelesTriangle(n);
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
    public static void printIsocelesTriangle(int noOfRows){
        for (int i=1;i<=noOfRows;i++) {
            printSpaceTriangle(noOfRows-i);
            printHorizontal(2*i-1);
            System.out.println();
        }
    }
    public static void printSpaceTriangle(int noOfRows){
        for (int i=noOfRows;i>=1;i--) {
            System.out.print(" ");
        }

    }
    public static void printHorizontal(int noOfColumns){
        for (int i=1;i<=noOfColumns;i++)
            System.out.print("*");
    }
}

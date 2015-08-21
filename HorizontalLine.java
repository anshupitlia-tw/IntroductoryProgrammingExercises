import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by anshup on 20/08/15.
 */
public class HorizontalLine {
    public static void main(String args[]){
        int n;
        n=getInput();
        printHorizontal(n);
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
    public static void printHorizontal(int noOfRows){
        for (int i=1;i<=noOfRows;i++)
        System.out.print("*");
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by anshup on 20/08/15.
 */
public class PrimeFactorsExercise {
    public static void main(String args[]){
        int n;
        n=getInput();
        generate(n);
    }
    public static int getInput(){
        System.out.println("Enter n");
        Scanner sn = new Scanner(System.in);
        try {
            return sn.nextInt();
        }catch(InputMismatchException ime){
            System.out.println("Input mismatches. Default n is 30");
            return(30);
        }
    }

    public static void generate(int num){
        while (num%2 == 0){
            System.out.println(2);
            num/=2;
        }
        for (int i=3;i<Math.sqrt(num);i=i+2){
            while(num%i==0) {
                System.out.println(i);
                num/=i;
            }
        }
        if (num > 2){
            System.out.println(num);
        }
    }
}

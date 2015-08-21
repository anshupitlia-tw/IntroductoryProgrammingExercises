/**
 * Created by anshup on 20/08/15.
 */
public class FizzBuzz {
    public static void main(String args[]){
        for (int i=1;i<=100;i++){
            printNumber(i);
        }
    }
    public static void printNumber(int n){
        boolean printed = false;
        if (n%3 == 0){
            System.out.print("Fizz");
            printed = true;
        }
        if (n%5 == 0){
            System.out.print("Buzz");
            printed = true;
        }
        if (!printed){
            System.out.print(n);
        }
        System.out.println();
    }
}

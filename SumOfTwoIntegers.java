
//QUESTION---> Write a code to add two given integers without using "+" and "-" operators;


package BitManipulation;
import java.util.Scanner;
public class SumOfTwoIntegers{
    public static int getSum(int x, int y) {
        while (y != 0) {
            int temp = (x & y) << 1;

            x = x ^ y;

            y = temp;
        }
        return x;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number X: ");
        int x=sc.nextInt();
        System.out.println("Enter the second number Y: ");
        int y= sc.nextInt();

        int result=getSum(x,y);
        System.out.println(result);

    }
}

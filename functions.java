import java.util.*;

public class functions {
    /*public static void printMyName(String Name) {
        System.out.println(Name);
        return;
        }*/
    /*public static int calculateSum(int a,int b) {
        int sum  = a + b;
        return sum;
    }*/

    public static int calculateProduct(int a,int b) {
        int product = a * b;
        return product;
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        /*String Name = sc.next();
        printMyName(Name);*/
        /*int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a ,b);
        System.out.println("Sum of 2 number is :"+sum);*/

        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateProduct(a,b);
        System.out.println("Product of 2 number is:"+product);
    }
}

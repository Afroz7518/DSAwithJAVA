import java.util.*;

public class practice {
    public static int avgCount(int a, int b, int c) {
        int average = a+b+c/3;
        return average;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = avgCount(a,b,c);

        System.out.println("the average of three number is :"+average);

        //solve further question of function and pattern

    }
}

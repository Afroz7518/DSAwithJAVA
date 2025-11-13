import java.util.*;


public class array {
    public static void main(String arrgs[]) {
//        int [] marks = new int[4];
//        marks[0] = 96;
//        marks[1] = 85;
//        marks[2] = 87;
//        marks[3] = 98;
//
//        for (int i=0; i<4; i++) {
//            System.out.println(marks[i]);
//        }

    // take array size input to user

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] number = new int[size];

        //take input of array element

        for (int i=0; i<size; i++) {
            number [i] = sc.nextInt();
        }

        int x = sc.nextInt();

        // for output of array

        for (int i=0; i< number.length; i++) {

            //find any element and print their index value

            if (number [i] == x) {
                System.out.println("x found at index :" + i);
            }
        }
    }
}

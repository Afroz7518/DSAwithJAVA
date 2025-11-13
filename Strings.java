import java.util.*;

// string are immutable type

public class Strings {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Your name is : " + name);

        // function use in string

        // 1- concatenation

        //String firstname = "Afroz";
        //String lastname = "Alam";
        //String fullname = firstname + " " + lastname;
        //System.out.println(fullname);

        // 2- (.length()) function

        //System.out.println(firstname.length());

        // 3- (.charAt()) function is use to print character of string

        //for (int i=0; i<fullname.length(); i++) {
        //    System.out.println(fullname.charAt(i));
        //}

        // 4- (.compareto()) function is use to comapare two string
        // string1 > string2 : +ve value
        // string1 == string2 : 0
        // string1 < string2 : -ve value

//        String name1 = "Afroz";
//        String name2 = "Alam";
//
//        if (name1.compareTo(name2) == 0) {
//            System.out.println("String are equal");
//        } else {
//            System.out.println("String is not equal");
//        }

        //4- (.substring()) function use to slicing the string it starting and ending index

        String sentence = "My name is Afroz Alam";
        String name = sentence.substring(11);
        System.out.println(name);
    }
}

package arraylist;
/**
 * ArrayList Printing Letters A to Z
 */

import java.util.ArrayList;

public class ArrayListExampleTwo {
    public static void main(String[] args) {
        //Creating An ArrayList Of Strings

        ArrayList<Character> letters = new ArrayList<>(26);

        for (char ch = 'A' ; ch <= 'Z'; ++ch) {
            letters.add(ch);
            System.out.println("This is the english alphabet " + ch);

        }

        System.out.print(letters);


    }
}

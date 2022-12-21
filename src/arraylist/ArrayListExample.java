package arraylist;
/**
 *  Java program to demonstrate the
 * working of ArrayList in Java
 */

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {

        int n = 10;

        ArrayList<Integer> integers = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            integers.add(i);

        }

        //prints out all the integers
        System.out.println(integers);


        //prints element one by one
        for (int i = 0; i < integers.size(); i++) {

            System.out.print(integers.get(i) + " ");
        }



    }
}

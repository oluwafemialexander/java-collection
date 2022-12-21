package array;

/**
 * Outputs Code From Zero To Ten Using Array
 */
public class ExampleOne {

    public static void main(String[] args) {
        int[] numbers = new int[11];

        int i;

        for ( i = 1; i <= 10; i++) {
            numbers[i] = i;
            System.out.println("This is sample[" + i + "]: " + numbers[i]);
        }


    }
}

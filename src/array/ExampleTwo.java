package array;

/**
 * Outputs Code From A To Z Using Array
 */
public class ExampleTwo {
    public static void main(String[] args) {
        char[] alphabets = new char[26];

        for (char ch = 'A'; ch <= 'Z'; ++ch) {
            alphabets[ch - 'A'] = ch;

            System.out.println("This is the english Alphabet " + ch );

        }
    }
}

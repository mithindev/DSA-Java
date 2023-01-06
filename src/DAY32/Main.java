package DAY32;
// program to remove all the "a" from the given word.

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello");
        skip("", "bacapplcdah");


    }
    static void skip (String p, String up) {
        if (up.isEmpty()) { // checks if the string is empty!
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0); // takes the char @ oth index

        if (ch == 'a') {
            skip(p, up.substring(1)); // skips the first element
            // note:-
            // str.substring(n)
            // creates a new string without the first n elements of str

        } else {
            skip(p + ch, up.substring(1));
        }
    }

    stati
}

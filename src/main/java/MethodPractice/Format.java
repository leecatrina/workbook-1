package MethodPractice;

public class Format {
    public static void main(String[] args) {
        //Call the method with actual values (arguments)

        System.out.println(formatName("Bob", "Smith"));

        //store the return value in a variable

        String fullName = formatName("Bob", "Smith");
        System.out.println(fullName);
    }

    public static String formatName(String first, String last) {
        return last + ", " + first;
    }


}

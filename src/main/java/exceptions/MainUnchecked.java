package exceptions;

public class MainUnchecked {
    public static void main(String[] args) {

        processString(null);

//        getChar("Ana");

        int[] arr = new int[10];
//        displayArray(arr);

//        stringToInteger();
        division();

    }

    public static void processString(String s) {
        if (s != null) {
            s.toString();
        }
    }

    public static void getChar(String s) {
        s.charAt(100);
    }

    public static void displayArray (int[] arr) {
        System.out.println(arr[1000]);
    }

    public static void stringToInteger () {
        String s = "FOOBAR";
        int i = Integer.parseInt(s);
    }

    public static void division(){
        int x = 0;
        int y = 10;
        int z = y / x;
    }
}

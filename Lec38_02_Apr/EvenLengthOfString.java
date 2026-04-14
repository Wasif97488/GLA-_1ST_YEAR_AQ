package Lec38_02_Apr;

public class EvenLengthOfString{

    public static void main(String[] args) {

        String[] arr = {"Java", "Code", "Hello", "World", "AI"};

        for (String str : arr) {
            if (str.length() % 2 == 0) {
                System.out.println(str + " -> EVEN length (" + str.length() + ")");
            } else {
                System.out.println(str + " -> ODD length (" + str.length() + ")");
            }
        }
    }
}

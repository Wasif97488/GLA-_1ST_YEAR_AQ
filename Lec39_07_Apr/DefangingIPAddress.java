package Lec39_07_Apr;

public class DefangingIPAddress{

    public static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char ch = address.charAt(i);

            if (ch == '.') {
                result.append("[.]");
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String ip = "192.168.0.1";
        System.out.println(defangIPaddr(ip));
    }
}

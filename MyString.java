
public class MyString {

    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        // System.out.println(contains("unhappy", "happy")); // true
        // System.out.println(contains("happy", "unhappy")); // false
        // System.out.println(contains("historical", "story")); // false
        // System.out.println(contains("psychology", "psycho")); // true
        // System.out.println(contains("personality", "son")); // true
        // System.out.println(contains("personality", "dad")); // false
        // System.out.println(contains("resignation", "sign")); // true      

        System.out.println(contains("baba yaga", "baba"));
        System.out.println(contains("baba yaga", ""));
        System.out.println(contains("baba yaga", "John Wick is the baba yaga"));
        System.out.println(contains("baba yaga", "Yaga"));
        System.out.println(contains("baba yaga", "babayaga"));
    }

    /**
     * Returns the lowercase version of the given string.
     */
    public static String lowerCase(String str) {
        String lowStr = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                lowStr += (char) (str.charAt(i) + 32);
            } else {
                lowStr += str.charAt(i);
            }
        }
        return lowStr;
    }

    /**
     * If str1 contains str2, returns true; otherwise returns false.
     */
    public static boolean contains(String str1, String str2) {
        //str1 = lowerCase(str1);
        //str2 = lowerCase(str2);
        if (str2.length() > str1.length()) {
            return false;
        }
        if (str2.length() == 0) {
            return true;
        }
        int index = 0;
        String subStr = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(index)) {
                //System.out.println(str1.charAt(i) + " ," + str2.charAt(index));
                subStr += str2.charAt(index);
                if (index + 1 < str2.length()) {
                    index++;
                } else if (str1.charAt(i) != str2.charAt(index)) {
                    System.out.println(str1.charAt(i) + ", " + str2.charAt(index));
                    return false;
                } else {
                    break;
                }
            } else if (str1.charAt(i) != str2.charAt(index)) {
                return false;
            }
        }
        return (str2.equals(subStr));
    }
}

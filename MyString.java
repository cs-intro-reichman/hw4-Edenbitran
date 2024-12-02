
public class MyString {

    public static void main(String[] args) {
         System.out.println("Testing lowercase:");
         System.out.println("UnHappy : " + lowerCase("UnHappy"));
         System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
         System.out.println("TLV : " + lowerCase("TLV"));
         System.out.println("lowercase : " + lowerCase("lowercase"));

         System.out.println("Testing contains:");
          System.out.println(contains("unhappy", "happy")); // true
          System.out.println(contains("happy", "unhappy")); // false
          System.out.println(contains("historical", "story")); // false
          System.out.println(contains("psychology", "psycho")); // true
          System.out.println(contains("personality", "son")); // true
          System.out.println(contains("personality", "dad")); // false
          System.out.println(contains("resignation", "sign")); // true            

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
        boolean bool = false;
        str1 = lowerCase(str1);
        str2 = lowerCase(str2);
        if (str2.length() > str1.length()) {
            return false;
        }
        if (str2.length() == 0) {
            return false;
        }
        int index = 0;
        String subStr = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(index)) {
           //     System.out.println(str1.charAt(i)+" ,"+str2.charAt(index));
                subStr += str1.charAt(i);
                if (index + 1 < str2.length()) {
                    index++;
                }
                else if (str1.charAt(i) != str2.charAt(index)) {
                    return false;
                }
                else {
                    break;
                }
            }
        }
        //System.out.println("sub str- "+subStr);
        if(subStr.equals(str2)){
            bool = true;
        }
        else{
            return false;
        }
        return bool;
    }
}

// for (int i = 0; i < str1.length(); i++) {
//     System.out.println("str1 -" + str1 + " str2- " + str2);
//     for (int j = 0; j < str2.length(); j++) {
//         // if no char is in common
//         if (str2.charAt(j) != str1.charAt(i)) {
//             System.out.println(str2.charAt(j) + " " + str1.charAt(i) + " bool- " + bool);
//             bool = false;
//             if (i > str2.length() && bool == false) {
//                 return false;
//             }
//         } else if ((str2.charAt(j) == str1.charAt(i)) && (i < str2.length())) {
//             index = i;
//             if (str2.charAt(j) != str1.charAt(i)) {
//                 return false;
//             } else {
//                 bool = true;
//             }
//         }
//     }
// }


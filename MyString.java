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

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {
        String lowerCaseStr = "";
        for (int i=0;i<str.length();i++)
        {
            if (str.charAt(i) <=90 &&  str.charAt(i) >= 65) {
            lowerCaseStr += (char)(str.charAt(i)+32);
            }
            else {
                lowerCaseStr += str.charAt(i);
            }
        }
        return lowerCaseStr;
    }

    public static int indexOf(String str, char ch) {
        int firstIndex=-1;
         for (int i=0;i<str.length();i++)
         {
             if (str.charAt(i) == ch)
             {
                 firstIndex=i;
                 break;
             }
         }
         return firstIndex;
     }
     

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        int countFound= 0;

        if (str2.length() == 0 ) {
            return true;
        }

        if (str1.length() < str2.length()) {
            return false;
        }

        int firstIndex = indexOf(str1, str2.charAt(0));

        if (firstIndex == -1) {
            return false;
        }

        for (int i=0;i<str2.length();i++) 
        {  
            if (firstIndex+i == str1.length()) {
                return false;
            }

            if (str1.charAt(i+firstIndex) != str2.charAt(i)) {
               countFound=0;
            }
            else {
                countFound++;
            }

            if (countFound == str2.length()) {
                return true;
                
            }
        }
        return false;
    }
}

package DCordova;

import static DCordova.DCordovaLib.*;

public class TestFile {

        public static void main(String[] args) {

            System.out.println(isPalindrome("racecar"));
            System.out.println(isPalindrome("bottle"));
            System.out.println(cutOut("catattack", "att"));
            System.out.println(cutOut("catcatcat", "cat"));
            System.out.println(sumUpTo(2));
            System.out.println(sumUpTo(100));
            System.out.println(sumUpTo(0));
            primePrinter(10);

        }


}



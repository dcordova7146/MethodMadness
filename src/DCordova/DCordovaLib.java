//Diego Cordova 9/20/2018;

package DCordova;

public class DCordovaLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    /**
     *checks if a phrase is a palindrome
     * @param phrase a phrase to be checked for if it is a palindrome which is a word that is the same spelled backwords
     * @return boolean: if it is a palindrome it shall return true
     */
    public static boolean isPalindrome(String phrase){ //Working
        String reversed = "";

        for(int i = phrase.length()-1; i >= 0; i-- ){
            reversed += phrase.substring(i, i+1);
        }

        return (reversed.equals(phrase));
    }

   //public static String dateStr(int month, int day, int year){


    //}

    /**
     *cuts out a desired word out of a bigger word
     * @param main a word or phrase
     * @param cut  a portion of the main that you wish to be taken out of the word
     * @return a string that is the main word phrase without the "cut" portion
     */
    public static String cutOut(String main, String cut){ //Working
        String part1 = "";
        String part2 = "";
        if(main.indexOf(cut) < 0) {
           return(main);
        }
        //main.substring(main.indexOf(cut),main.indexOf(cut)+cut.length())
        part1 = main.substring(0, main.indexOf(cut));
        part2 = main.substring(main.indexOf(cut) + cut.length());
        return (part1 + part2);

    }

    /**
     *adds up all number within a givin number
      * @param integer a number which you want the sum of all its previous numbers
     * @return and integer that is the sum of all the previous numbers inclusive
     */
    public static int sumUpTo(int integer){  //working
        int x = 0;
        if(integer == 0) {
            return 0;
        }
        x = ((integer/2)*(1+integer));

        return x;
    }

    /**
     *
     * @param num the upper limit for how many prime numbers you wish printed
     * @return returning a list of the first prime numbers up until num
     */

    public static void primePrinter(int num){
        String list = "";
        for(int i = 1;i != num; i ++){
            boolean isprime = checkprime(i);
            if(isprime == true){
                int x = i;
                list += String.valueOf(x) + ", ";
            }
        }
        System.out.println(list);

    }

    /**
     *
     * @param num
     * @return
     */
    public static boolean checkprime(int num){
        if( num < 2){
            return false;
        }
        for(int i = 2;i < num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }


    public static String datestr(String str){
        String format = "";
        format = str.substring(0,2);
        format += "-";
        format = str.substring()
    }


}

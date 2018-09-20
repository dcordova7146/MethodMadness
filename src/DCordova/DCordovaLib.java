//Diego Cordova 9/20/2018;

package DCordova;

public class DCordovaLib {

    public static void println(String str)
    {
        System.out.println(str);
    }

    public static boolean isPalindrome(String phrase){ //Working
        String reversed = "";

        for(int i = phrase.length()-1; i >= 0; i-- ){
            reversed += phrase.substring(i, i+1);
        }

        return (reversed.equals(phrase));
    }

   //public static String dateStr(int month, int day, int year){


    //}

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

    public static int sumUpTo(int integer){
        int x = 0;
        if(integer == 0) {
            return 0;
        }
        x = ((integer/2)*(1+integer));

        return x;
    }

    public static primePrinter(int num){

    }


}

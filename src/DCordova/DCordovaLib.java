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

    public static String dateStr(int month, int day, int year){

    }

    public static String cutOut(String main, String cut){
        
    }
}

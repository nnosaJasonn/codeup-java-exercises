public class StringExercise {
    public static void main(String[] args) {
       /* String message = "We don't need no education \n We don't need no thought control \n Check \"this\" out!, \"s inside of \"s! \nIn windows, the main drive is usually C:\\ \n I can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\";
        System.out.println(message);*/

       String string = "hello, my name is mike";
        System.out.println(string);
        System.out.println(flipString(string));
    }
    public static String flipString(String myStr) {
        if (myStr.isEmpty()){
            System.out.println("String in now Empty");
            return myStr;
        }
        //Calling Function Recursively
        System.out.println("String to be passed in Recursive Function: "+myStr.substring(1));
        return flipString(myStr.substring(1)) + myStr.charAt(0);
    }


}


/*return method(substring after first character plus substring rest of string) */
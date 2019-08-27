import java.util.ArrayList;
import java.util.Arrays;


public class ArrayFun {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};

        int[] arr2 = new int[]{1, 2, 3, 4, 5};

        long[] arr3 = new long[]{1, 1 / 4/*, 1/7, 1/10, 1/16*/};

        System.out.println("seriesSum(3) = " + seriesSum(3));

        int[] arr4 = new int[]{1, 8, 99, 12, 13, 4};

        bubbleSort(arr4);

//        rotateLeft(arr, 3);
//    String str = "sheebabeeba";
//
//    char[] toSwap = str.toCharArray();
//    char[] swapHelp = new char[str.length()];
//        int j = 0;
//        for (int i = str.length()-1; i>=0; i--){
//            swapHelp[j] = toSwap[i];
//            j++;
//
//        }
//
//        String reversed = new String(swapHelp);
//        System.out.println(reversed);
//        System.out.println(str);

//    char[] ints = {'A', 'F', 'F', 'E', 'Z', 'O', 'W'};
//    for(char l:ints){
//        System.out.println(l);
//    }
//        char[] sortedInts = new char[ints.length];
//    for(int i=0; i<ints.length-1; i++){
//        System.out.println("i is now " + i);
//        for(int j=0; j<ints.length-i-1; j++){
//            System.out.println("j is now " + j + " and ints[j] is now " + ints[j]);
//            if (ints[j] > ints[j+1]){
//                char holder = ints[j];
//                ints[j] = ints[j+1];
//                ints[j+1] = holder;
//            }
//        }
//    }
//    for(char k: ints){
//        System.out.println(k);
//    }
        //1, 2, 3, 4, 5
        //expect: 3, 4, 5, 1, 2
//        int[] sortee = {3, 4, 8, 2, 99, 12, 44, 2, 7, 0, 444};
//        for(int s:sortee){
//                  System.out.println(s);
//    }
//        System.out.println("======================");
//        for(int p:bubbleSort(sortee)){
//        System.out.println(p);
//    }
//        rotateLeft(arr, 3);

        rotateRight(arr2, 3);
//    int[] arrtosort = {3, 7, 1, 9, 14, 2, 0};
//    bubbleSort(arrtosort);
//        String joinpractice = "heres's a string to put into an array";
//        String[] joined = joinpractice.split(" ");
//        for(String word: joined){
//            System.out.println(word);
//        }
//
//
//        String orig = "abc";
//        String rotate = "cab";
//        String concat = orig + orig;
//        System.out.println(concat.contains(rotate));
        System.out.println(longest("shibby", "bibbity"));

        System.out.println("toCamelCase(\"jason-is-cool\") = " + toCamelCase("jason-is-cool"));

        System.out.println("getXO(\"joobxxo\") = " + getXO("joobxxo"));
        System.out.println(multiples());

    }

//    public static int[] rotateLeft(int[] arr, int n) {
//       for(int i=0; i<n;i++){
//           int holder = arr[0];
//           for(int j=0; j<arr.length-1;j++){
//               arr[j] = arr[j+1];
//           }
//           arr[arr.length-1] = holder;
//       }
//        System.out.println(Arrays.toString(arr));
//       return arr;
//    }
////
//    public static int[] rotateRight(int[] arr, int n){
//        for(int a: arr){
//            System.out.println(a);
//        }
//        for(int i=0; i<n;i++){
//            int last = arr[arr.length-1];
//            for (int j=arr.length-1; j>0; j--){
//                arr[j] = arr[j-1];
//            }
//            arr[0]=last;
//        }
//        System.out.println(Arrays.toString(arr));
//
//        return arr;
//    }

//    public static int[] bubbleSort(int[] arr){
//
//        for(int i = 0; i<arr.length-1; i++){
//            for(int j = 0; j<arr.length - i - 1; j++){
//                if(arr[j] > arr[j+1]){
//                    int holder = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = holder;
//                }
//            }
//        }
//
//        return arr;
//    }


    public static String seriesSum(int n) {
        // Happy Coding ^_^	
        if (n == 1) {
            return "1.00";
        } else {
            double sum = 0;
            double count = 1;
            for (int i = 0; i < n; i++) {
                sum += (1 / count);
                count = count + 3;
            }
            String out = String.format("%.2f", sum);
            return out;
        }
    }

    static String toCamelCase(String s) {
        String[] strings;
        if (s.contains("-")) {
            strings = s.split("-");
        } else if (s.contains("_")) {
            strings = s.split("_");
        } else {
            strings = s.split("");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strings[0].toLowerCase());
        for (int i = 1; i < strings.length; i++) {
            strings[i] = strings[i].substring(0, 1).toUpperCase() + strings[i].substring(1);
            sb.append(strings[i]);
        }
        String camelCase = new String(sb);


        return camelCase;
    }


    public static String longest(String s1, String s2) {
        // your code
        String str = s1 + s2;
        String newStr = "";
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            if (newStr.indexOf(ch) == -1) {
                newStr += ch;
            }
        }

        char[] noDup = newStr.toCharArray();

        for (int i = 0; i < noDup.length - 1; i++) {
            for (int j = 0; j < noDup.length - i - 1; j++) {

                if (noDup[j] > noDup[j + 1]) {
                    char holder = noDup[j];
                    noDup[j] = noDup[j + 1];
                    noDup[j + 1] = holder;
                }
            }
        }

        String longest = new String(noDup);
        return longest;
    }

    public static int multiples() {

        int num = 0;
        for (int i = 1; i < 13195; i++) {
           boolean p = true;
            for (int j = 2; j < 13195; j++) {
                if (i % j == 0) {
                    p = false;
                }
            }
            if (p){
                num = i;
                System.out.println(num);
            }

        }
        return num;
    }


    public static boolean getXO(String str) {

        // Good Luck!!
        char[] chars = str.toCharArray();
        int xCount = 0;
        int oCount = 0;
        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == 'x' || chars[i] == 'X') {
                xCount++;
            }
            if (chars[i] == 'o' || chars[i] == 'O') {
                oCount++;
            }
        }
        if (xCount == oCount) {
            return true;
        } else {
            return false;
        }
    }


    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                int holder = arr[j];
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j + 1];
                    arr[j + 1] = holder;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }


//
//    public static int[] bubbleSort(int[] arr){
//        for(int i =0; i<arr.length-1;i++){
//            for(int j=0; j<arr.length-i-1; j++){
//                if(arr[j]>arr[j+1]){
//                    int holder = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = holder;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        return arr;
//    }

    //
//    public static int[] rotateLeft(int[] arr, int n)
//    {
//        for(int i = 0; i<n; i++){
//            int holder = arr[0];
//            for (int j = arr.length-1; j>0; j--){
//                arr[j] = arr[j-1];
//            }
//        arr[arr.length-1] = holder;
//        }
//        System.out.println(Arrays.toString(arr));
//        return arr;
//    }
//
    public static int[] rotateRight(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int holder = arr[arr.length - 1];
            for (int j = 0; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = holder;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}

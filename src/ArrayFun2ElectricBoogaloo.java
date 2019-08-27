import java.util.Arrays;

public class ArrayFun2ElectricBoogaloo {

    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 13, 3, 88, 1, 12};
        int[] arr2 = new int[]{1, 2, 3, 4, 5};
        int[] arr3 = new int[]{1, 2, 3};

        System.out.println("minChange(arr3, 55) = " + minChange(arr3, 55));
        
//        bubbleSort(arr1);
//        rotateLeft(arr2, 3);
//        rotateRight(arr3, 3);
////
//        String toRev = "I will be reversed";
//        reverseString(toRev);
//        String reverse = "one two three four five";
//        reverseWords(reverse);
////
////        insert(arr1, 11);
////
////        kSmallest(arr1, 3);
////        System.out.println(closestSum(arr1, 101));
//
//        String orig = "racecar";
//        String rot = "cecarra";
//        System.out.println(rotation(orig, rot));

        int n = 6;
        int last=0;
        int next=1;
        int output=0;
        for(int i=0; i<n; i++){
            output = next+last;
            last = next;
            next = output;
        }
        System.out.println(output);

    }



    public static int minChange(int[] coins, int target){
        int count=0;
        while(target >0){
            System.out.println(target);
            System.out.println("count = " + count);
            if(target>=3){
                target -= 3;
                System.out.println("subtracting 3");
            } else if(target>=2){
                target-=2;
                System.out.println("subtracting 2");

            } else if(target>=1){
                System.out.println("subtracting 1");

                target-=1;
            }
            count+=1;
        }
        return count;
    }

//    public static boolean rotation(f, String str2){
//
//        String str = str1 + str1;
//
//        if(str.contains(str2)){
//            return true;
//        } else {
//            return false;
//        }
//
//
//    }

    public static String reverseWords(String str){
        String[] strings = str.split(" ");
        str = "";
        for(int i=strings.length-1; i>=0; i--){
            str += strings[i] + " ";
        }
        str = str.substring(0, str.length()-1);
        System.out.println(str);
        return str;
    }

    public static String reverseString(String str){

        char[] string = str.toCharArray();
        String newStr = "";
        for(int i = string.length-1; i>=0; i--){
            newStr += string[i];
        }
        System.out.println(newStr);
        return newStr;
    }

    public static int[] rotateRight(int[] arr, int n){
        System.out.println(Arrays.toString(arr));

        for(int i=0; i<n; i++){
            int last = arr[arr.length -1];
            for (int j = arr.length-1; j>0; j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] rotateLeft(int[] arr, int n){
        System.out.println(Arrays.toString(arr));
        for(int i=0; i<n; i++){
            int first = arr[0];
            for(int j=0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = first;
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

    public static int[] bubbleSort(int[] arr){
        System.out.println(Arrays.toString(arr));
        for(int i=0; i< arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int bucket = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = bucket;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }

//    public static int[] rotateLeft(int[] arr, int n) {
//        System.out.println(Arrays.toString(arr));
//
//        for(int i=0; i<n; i++){
//            int first = arr[0];
//            for(int j = 0; j<arr.length-1; j++){
//                arr[j] = arr[j+1];
//
//            }
//            arr[arr.length -1] = first;
//        }
//
//        System.out.println(Arrays.toString(arr));
//        return arr;
//    }
//
//    public static int[] rotateRight(int[] arr, int n) {
//        System.out.println(Arrays.toString(arr));
//
//        for(int i=0; i<n; i++){
//            int last = arr[arr.length-1];
//            for(int j = arr.length-1; j>0; j--){
//                arr[j] = arr[j-1];
//
//            }
//            arr[0] = last;
//        }
//
//        System.out.println(Arrays.toString(arr));
//        return arr;
//    }
//
//    public static String reverseString(String str){
//        System.out.println(str);
//        char[] torev = str.toCharArray();
//        char[] reversed = new char[str.length()];
//        int j = 0;
//        for(int i = torev.length -1; i>=0; i--){
//            reversed[j] = torev[i];
//            j++;
//        }
//
//        str = new String(reversed);
//        System.out.println(str);
//        return str;
//    }
//    public static String reverseWords(String str){
//        System.out.println(str);
//        String[] strings = str.split(" ");
//        StringBuilder sb = new StringBuilder();
//        for(int i = strings.length -1; i>=0; i--){
//            sb.append(strings[i] + " ");
//        }
//        str = sb.toString();
//        System.out.println(str);
//        return str;
//    }
//
//    public static int[] insert(int[] arr, int num){
//        System.out.println(Arrays.toString(arr));
//        System.out.println("num = " + num);
//        int[] newArr = new int[arr.length +1];
//        for(int i =0; i<newArr.length-1; i++){
//            newArr[i] = arr[i];
//        }
//            newArr[newArr.length -1] = num;
//        for(int j = 0; j<newArr.length -1; j++){
//            for(int k = 0; k<newArr.length -j -1; k++){
//                if(newArr[k] > newArr[k+1]){
//                    int keep = newArr[k];
//                    newArr[k] = newArr[k+1];
//                    newArr[k+1] = keep;
//                }
//            }
//        }
//
//        System.out.println(Arrays.toString(newArr));
//        return newArr;
//    }
//
//    public static int kSmallest(int[] arr, int k){
//        arr = bubbleSort(arr);
//        int duplicount = 0;
//        int num = 0;
//        for(int i = 0; i<arr.length-1; i++){
//            if(arr[i] == arr[i+1]){
//                duplicount += 1;
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        int ksmall = arr[k-1 + duplicount];
//        System.out.println("ksmall = " + ksmall);
//        return ksmall;
//    }
//
//    public static String closestSum(int[] arr, int n){
//        int a = 0;
//        int b = 0;
//        int diff = Math.abs(n - (arr[0] + arr[arr.length-1]));
//        System.out.println(diff);
//        for(int i = 0; i<arr.length -1; i++){
//            for(int j = 0; j<arr.length -1; j++){
//                int sum = arr[i] + arr[j];
//                if(diff > Math.abs(n - sum)){
//                    a = arr[i];
//                    b = arr[j];
//                    diff = Math.abs(n-sum);
//                    System.out.println(diff);
//
//                }
//            }
//
//        }
//
//        return "the closest pair that equal the sum is " + a + " and " + b;
//    }
//
}

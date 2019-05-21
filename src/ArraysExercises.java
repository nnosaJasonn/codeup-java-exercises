import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] arr, Person person){
        Person[] newArr = new Person[arr.length + 1];
        for (int i = 0; i<arr.length; i++){
            newArr[i] = arr[i];
        }
        newArr[arr.length] = person;
        return newArr;
    }
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person jim = new Person("jim");
        Person mij = new Person("mij");

        Person imj = new Person("imj");

        Person[] personArray = {jim, mij, imj};
        System.out.println("Arrays.toString(personArray) = " + Arrays.deepToString(personArray));
        Person jmi = new Person("jmi");

        System.out.println("Arrays.toString(addPerson(personArray, jmi)) = " + Arrays.toString(addPerson(personArray, jmi)));


    }
}

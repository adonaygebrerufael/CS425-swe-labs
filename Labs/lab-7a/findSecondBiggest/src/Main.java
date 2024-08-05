import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {19,9,11,0,12};

        System.out.println(Arrays.toString(array1)   + " = SecondBiggest: " + findSecondBiggest(array1));
        System.out.println(Arrays.toString(array2)   + " = SecondBiggest: " + findSecondBiggest(array2));


    }

    public static int findSecondBiggest(int[] array){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int num: array){

           if(num > max){
               secondMax = max;
               max = num;
           }else if(num > secondMax && num < max){
               secondMax = num;
           }
        }

        return secondMax;
    }
}
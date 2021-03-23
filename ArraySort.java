package HW;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String[] args) {
        Integer[] myArray = {2, 3, 1, 7, 11};
        int[] myArray2 = {4, 6, 3, 2, 8, -7, -2, 3};
        int[] myArray3 = {4, 6, 7, 2, 3, 5, 6, 7, 8, 9, 2, 4, 5, 6, 7, 8};
        int[] myArray4 = {3, 2, 3, 1, 4, 2, 8, 3};
        int sum = 0;
        double averageNumbers = 0;
        double sum1 = 0;
        System.out.println("myArray elements " + Arrays.toString(myArray));
        Arrays.sort(myArray, Collections.reverseOrder());
        System.out.println("myArray elements revers order " + Arrays.toString(myArray));
        for (int i = 0; i < myArray2.length; i++) {
            if (myArray2[i] < 0)
                myArray2[i] = 0;
            sum = sum + myArray2[i];
        }
        System.out.println("Sum of all the positive elements myArray2:" + sum);
        if (myArray3.length > 0)
            for (int i = 0; i < myArray3.length; i++) {
                sum1 = sum1 + myArray3[i];
            }
        averageNumbers = sum1 / myArray3.length;
        System.out.println("Average numbers of elements myArray3:" + averageNumbers);
        for (int i = 0; i < myArray4.length; i++) {
            for (int j = i + 1; j < myArray4.length; j++) {
                if (myArray4[i] == myArray4[j])
                    myArray4[j] = 0;
            }
        }
        System.out.println("Elements of myArray4 Replace all duplicated" + Arrays.toString(myArray4));
    }
}

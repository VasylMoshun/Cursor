package HW;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String[] args) {
        Integer[] MyArray = {2, 3, 1, 7, 11};
        int[] MyAArray2 = {4, 6, 3, 2, 8, -7, -2, 3};
        int[] MyArray3 = {4, 6, 7, 2, 3, 5, 6, 7, 8, 9, 2, 4, 5, 6, 7, 8};
        int[] MyArray4 = {3, 2, 3, 1, 4, 2, 8, 3};
        int sum = 0;
        double AverageNumbers = 0;
        double sum1 = 0;
        System.out.println("MyArray elements " + Arrays.toString(MyArray));
        Arrays.sort(MyArray, Collections.reverseOrder());
        System.out.println("MyArray elements revers order " + Arrays.toString(MyArray));
        for (int i = 0; i < MyAArray2.length; i++) {
            if (MyAArray2[i] < 0)
                MyAArray2[i] = 0;
            sum = sum + MyAArray2[i];
        }
        System.out.println("Sum of all the positive elements MyAArray2:" + sum);
        if (MyArray3.length > 0)
            for (int i = 0; i < MyArray3.length; i++) {
                sum1 = sum1 + MyArray3[i];
            }
        AverageNumbers = sum1 / MyArray3.length;
        System.out.println("Average numbers of elements MyArray3:" + AverageNumbers);
        for (int i = 0; i < MyArray4.length; i++) {
            for (int j = i + 1; j < MyArray4.length; j++) {
                if (MyArray4[i] == MyArray4[j])
                    MyArray4[j] = 0;
            }
        }
        System.out.println("Elements of MyArray4 Replace all duplicated" + Arrays.toString(MyArray4));
    }
}








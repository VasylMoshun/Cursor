package HW;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class HW_1 {

    public static void main(String[] args) {

        Integer[] myarray = {2, 3, 1, 7, 11};
        int[] myarray2 = {4, 6, 3, 2, 8, -7, -2, 3};
        int[] myarray3 = {4,6,7,2,3,5,6,7,8,9,2,4,5,6,7,8};
        int[] myarray4 = {3, 2, 3, 1, 4, 2, 8, 3};
        int sum = 0;
        double average_numbers = 0;
        double sum1 = 0;

        System.out.println("myarray elements " + Arrays.toString(myarray));
        Arrays.sort(myarray, Collections.reverseOrder());
        System.out.println("myarray elements revers order " + Arrays.toString(myarray));


        for (int i = 0; i < myarray2.length; i++) {
            if (myarray2[i] < 0)
                myarray2[i] = 0;
            sum = sum + myarray2[i];
        }
        System.out.println("sum of all the positive elements myarray2:" + sum);


             if (myarray3.length > 0)
            for (int i = 0; i < myarray3.length; i++) {

                sum1 = sum1 + myarray3[i];
            }
        average_numbers = sum1 / myarray3.length;
        System.out.println("average numbers of elements myarray3:"+ average_numbers ) ;






        for (int i = 0; i < myarray4.length; i++) {
            for (int j = i + 1; j < myarray4.length; j++) {
                if (myarray4[i] == myarray4[j])
                    myarray4[j] = 0;


            }
        }
        System.out.println("Elements of myarray_4 Replace all duplicated" + Arrays.toString(myarray4) );
    }
}








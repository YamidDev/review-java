package arrays;

import java.util.Arrays;

public class WorkWithArrays {
    public static void main(String[] args) {
        String[] days = new String[7];
        int [][] multiple = new int[10][10];
        int [][] myArr = {{2,5,-9}, {-7,25,0}, {3,2,4}};
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";
        System.out.println("the second day of the week is: "+days[1]);

        int [] numbers = {1,-2,3,4,5,16};
        int min, max;
        min = max = numbers[0];
        for (int i = 0; i <= numbers.length -1; i++) {
            if (numbers[i] > max) max = numbers[i];
            if (numbers[i] < min) min = numbers[i];
        }
        System.out.println("the value min is: "+ min + " and the value max is: "+max);
        min = max = numbers[0];
        for (int number: numbers) {
            System.out.println("in this iteration number value of: "+ number);
            if (number > max) max = number;
            if (number < min) min = number;
        }

        System.out.println("the value min is: "+ min + " and the value max is: "+max);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                multiple[i][j] = i * j;
            }
        }
        System.out.println("The result of 4*5 is: "+multiple[4][5]);

        for  (int[] arrayDim : myArr) {
            System.out.println("In this iteration myArr has: "+ Arrays.toString(arrayDim));
        }
    }
}

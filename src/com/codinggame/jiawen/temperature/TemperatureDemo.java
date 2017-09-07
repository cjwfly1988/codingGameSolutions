package com.codinggame.jiawen.temperature;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jchen on 07/09/17.
 */
public class TemperatureDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] temps = input.nextLine().split(" ");
        //convert string to int array
        int[] temperatures = Arrays.asList(temps).stream().mapToInt(Integer::parseInt).toArray();
        int diff = Integer.MAX_VALUE;

        for (int n : temperatures) {
            if (n == 0) {
                System.out.println("da da! ");
            }
        }


        int closestIndex;

        for (int i = 0; i < temperatures.length; i++) {
            int abs = Math.abs(temperatures[i]);
            if (abs < diff) {
                closestIndex = i;
                diff = abs;
            }
        }
    }
}

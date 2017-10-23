package com.codinggame.jiawen.temperature;

import java.util.Arrays;
import java.util.Scanner;


public class TemperatureDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] temps = input.nextLine().split(" ");

        //convert string to int array
        int[] temperatures = Arrays.asList(temps).stream().mapToInt(Integer::parseInt).toArray();

        long startTime = System.nanoTime();

        int closestIndex = 0;

        int i;
        for (i = 0; temperatures[i] < 0; i++) {

        }

        int currentMin = Math.abs(temperatures[i]);
        closestIndex = i;

        for (i = i + 1; i < temperatures.length; i++) {
            int current = temperatures[i];

            if ((currentMin > current && temperatures[i] > 0)) {
                currentMin = current;
                closestIndex = i;
            }

        }
        long endTime = System.nanoTime();
        System.out.println("The time costs " + (endTime - startTime) + "\n");
        System.out.println("the closest is " + temperatures[closestIndex]);

    }

}

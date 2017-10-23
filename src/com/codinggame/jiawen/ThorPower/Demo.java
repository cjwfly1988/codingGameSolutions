package com.codinggame.jiawen.ThorPower;

import java.lang.reflect.Type;
import java.util.Scanner;

/**
 * Created by jchen on 20/10/17.
 */
public class Demo {
    private enum Direction {N, NE, E, SE, S, SW, W, NW}


    public static void main(String[] args) {
        boolean gameContinue = true;
        Direction direction;

        Scanner input = new Scanner(System.in);
        int lightX = input.nextInt();
        int lightY = input.nextInt();
        int initialTX = input.nextInt();
        int initialTY = input.nextInt();

        if ((lightX > 40 || lightY > 18) && (initialTX > 40 || initialTY > 18)) {
            System.out.println("board should be 40 x 18 size");
            lightX = input.nextInt();
            lightY = input.nextInt();
            initialTX = input.nextInt();
            initialTY = input.nextInt();
        }

        System.out.println("The light is placed at " + lightX + " , " + lightY);
        System.out.println("Thor initial position is " + initialTX + " , " + initialTY);

        while (gameContinue) {
            System.out.println("Give action please ");
            direction = Direction.valueOf(input.next());

            switch (direction) {
                case N:
                    initialTY++;
                    break;
                case S:
                    initialTY--;
                    break;
                case W:
                    initialTX--;
                    break;
                case E:
                    initialTX++;
                    break;
                default:
                    System.out.println("What you doing !");
                    break;
            }

            if (initialTX == lightX && initialTY == lightY) {
                gameContinue = false;
                System.out.println("Thor get the light power !");
            }
        }

        System.out.println("Game over !");

    }
}

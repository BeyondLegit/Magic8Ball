package me.magic8ball.mike;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mike on 9/21/2016.
 */
public class MagicBall {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Please type in a question: ");
            String question = input.nextLine();
            int number = new Random().nextInt(20);

            if (number == 0)
                System.out.println("As I see it, yes");

            if (number == 1)
                System.out.println("It is certain");

            if (number == 2)
                System.out.println("It is decidedly so");

            if (number == 3)
                System.out.println("Most likely");

            if (number == 4)
                System.out.println("Outlook good");

            if (number == 5)
                System.out.println("Signs point to yes");

            if (number == 6)
                System.out.println("Without a doubt");

            if (number == 7)
                System.out.println("Yes");

            if (number == 8)
                System.out.println("Yes – definitely");

            if (number == 9)
                System.out.println("You may rely on it");

            if (number == 10)
                System.out.println("Reply hazy, try again");

            if (number == 11)
                System.out.println("Ask again later");

            if (number == 12)
                System.out.println("Better not tell you now");

            if (number == 13)
                System.out.println("Cannot predict now");

            if (number == 14)
                System.out.println("Concentrate and ask again");

            if (number == 15)
                System.out.println("Don't count on it");

            if (number == 16)
                System.out.println("My reply is no");

            if (number == 17)
                System.out.println("My sources say no");

            if (number == 18)
                System.out.println("Outlook not so good");

            if (number == 19)
                System.out.println("Very doubtful");

            System.out.println();
        }
    }
}

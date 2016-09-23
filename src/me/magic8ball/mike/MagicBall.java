package me.magic8ball.mike;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Mike on 9/21/2016.
 */
public class MagicBall {
    private static String[] answers = {
            "It is certain",
            "It is decidedly so",
            "Without a doubt",
            "Yes, definitely",
            "You may rely on it",
            "As I see it, yes",
            "Most likely",
            "Outlook good",
            "Yes",
            "Signs point to yes",
            "Reply hazy try again",
            "Ask again later",
            "Better not tell you now",
            "Cannot predict now",
            "Concentrate and ask again",
            "Don't count on it",
            "My reply is no",
            "My sources say no",
            "Outlook not so good",
            "Very doubtful"
    };
    public static void main(String[] args) {

        Random random = new Random();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("Please type  a question.");
            String question = input.nextLine();

            if (question.equalsIgnoreCase("exit")) {
                running = false;
            } else {
                System.out.println(answers[random.nextInt(answers.length)] + "\n");
            }

        }

        input.close();

    }
    }


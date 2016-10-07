package ua.rd;

import java.util.Arrays;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));

//        new Runner().askUser();
    }

    public void askUser() {
        Scanner scanner = new Scanner(System.in);
        String command;
        do {
            System.out.print("Your command: ");
            command = scanner.nextLine();
            System.out.println("You're written: " + command);
        } while (!command.equalsIgnoreCase("exit"));
    }

}

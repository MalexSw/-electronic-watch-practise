package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int totalSeconds = seconds % (24 * 3600);

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int secondsOutput = totalSeconds % 60;

        System.out.printf("%d:%02d:%02d%n", hours, minutes, secondsOutput);


    }
}

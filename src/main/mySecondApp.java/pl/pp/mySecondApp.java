package pl.pp;

import java.util.Scanner;

public class mySecondApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age in years: ");
        int ageInYears = scanner.nextInt();

        long ageInSeconds = (long) ageInYears * 365 * 24 * 60 * 60;

        System.out.println("My age in seconds is: " + ageInSeconds + " seconds");
        scanner.close();


    }
}

/*
    Scanner scanner = new Scanner(System.in);


        System.out.println("Please enter your name:");
                String forename = scanner.nextLine();

                System.out.println("Please enter your surname:");
                String surname = scanner.nextLine();

                scanner.close();

                System.out.println("Welcome " + forename + " " + surname);
                */
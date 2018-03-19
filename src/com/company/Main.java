package com.company;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Player p1 = new Player("Player 1", 0);
        Player p2 = new Player("Player 2", 0);
        Player comp = new Player("Computer", 0);
        mainMenu();
    }

    private static void increaseScore(Player player) {
        player.score += 1;
    }

    private static void playAgain() {
        System.out.println("\nWanna play again?\ny/n");
        Scanner input = new Scanner(System.in);
        String userString = input.nextLine().toUpperCase();
        switch (userString) {
            case "Y":
                playPlayer();
                break;
            case "N":
                System.out.println("Thanks for playing!!");
                mainMenu();
                break;
            default:
                System.out.println("Invalid input");
                playAgain();
                break;
        }
    }

    private static void playComputerAgain() {
        System.out.println("\nWanna play again?\ny/n");
        Scanner input = new Scanner(System.in);
        String userString = input.nextLine().toUpperCase();
        switch (userString) {
            case "Y":
                playComputer();
                break;
            case "N":
                System.out.println("Thanks for playing!!");
                mainMenu();
                break;
            default:
                System.out.println("Invalid input");
                playComputerAgain();
                break;
        }
    }

    private static String checkForWinnerPlayer(String answer1, String answer2) {
        String results = "";
        if (answer1.equals(answer2)) results = "It is a Tie";
        switch (answer1) {
            case "ROCK":
                if (answer2.equals("PAPER")) {
                    results = "Player 2 wins!!";
                } else if (answer2.equals("SCISSORS")) results = "Player 1 wins!!";
                break;
            case "PAPER":
                if (answer2.equals("ROCK")) results = "Player 1 wins!!";
                else if (answer2.equals("SCISSORS")) results = "Player 2 wins!!";
                break;
            case "SCISSORS":
                if (answer2.equals("ROCK")) results = "Player 2 wins!!";
                else if (answer2.equals("PAPER")) results = "Player 1 wins!!";
                break;
        }
        return results;
    }

    private static String checkForWinnerComputer(String answer1, String answer2) {
        String results = "";
        if (answer1.equals(answer2)) results = "It is a Tie";
        switch (answer1) {
            case "ROCK":
                if (answer2.equals("PAPER")) results = "Computer wins!!";
                else if (answer2.equals("SCISSORS")) results = "You win!!";
                break;
            case "PAPER":
                if (answer2.equals("ROCK")) results = "You win!!";
                else if (answer2.equals("SCISSORS")) results = "Computer wins!!";
                break;
            case "SCISSORS":
                if (answer2.equals("ROCK")) results = "Computer wins!!";
                else if (answer2.equals("PAPER")) results = "You win!!";
                break;
        }
        return results;
    }

    private static int randInt(){
        Random rand = new Random();
        return rand.nextInt((3 - 1) +1) + 1;
    }

    private static void playComputer() {
        String player1 = "";
        String player2 = "";
        System.out.println("\n" +
                "Let's Play\n" +
                "====\n" +
                "\n" +
                "PLAYER 1\n" +
                "1. Type in 'rock' 'paper' or 'scissors' to play.\n" +
                "2. Type 'quit' to go back to the Main Menu");
        Scanner input = new Scanner(System.in);
        String userString = input.nextLine().toUpperCase();
        switch (userString) {
            case "ROCK":
                player1 = "ROCK";
                break;
            case "PAPER":
                player1 = "PAPER";
                break;
            case "SCISSORS":
                player1 = "SCISSORS";
                break;
            case "QUIT":
                mainMenu();
                break;
            default:
                System.out.println("Invalid Input");
                playPlayer();
                break;
        }
        int randNum = randInt();
        switch (randNum) {
            case 1:
                player2 = "ROCK";
                break;
            case 2:
                player2 = "PAPER";
                break;
            case 3:
                player2 = "SCISSORS";
                break;
        }
        System.out.println("\nYou picked:  " + player1);
        System.out.println("Computer picked:  " + player2);
        System.out.println("\n*****  " + checkForWinnerComputer(player1, player2) + "  *****");
        playComputerAgain();

    }

    private static void playPlayer() {
        String player1 = "";
        String player2 = "";
        System.out.println("\n" +
                "Let's Play\n" +
                "====\n" +
                "\n" +
                "PLAYER 1\n" +
                "1. Type in 'rock' 'paper' or 'scissors' to play.\n" +
                "2. Type 'quit' to go back to the Main Menu");
        Scanner input = new Scanner(System.in);
        String userString = input.nextLine().toUpperCase();
        switch (userString) {
            case "ROCK":
                player1 = "ROCK";
                break;
            case "PAPER":
                player1 = "PAPER";
                break;
            case "SCISSORS":
                player1 = "SCISSORS";
                break;
            case "QUIT":
                mainMenu();
                break;
            default:
                System.out.println("Invalid Input");
                playPlayer();
                break;
        }

        System.out.println("\n" +
                "\n\n\n\n\n\n\n\n\n\n\n\n\nPLAYER 2\n" +
                "1. Type in 'rock' 'paper' or 'scissors' to play.\n" +
                "2. Type 'quit' to go back to the Main Menu");
        Scanner input2 = new Scanner(System.in);
        String userString2 = input2.nextLine().toUpperCase();
        switch (userString2) {
            case "ROCK":
                player2 = "ROCK";
                break;
            case "PAPER":
                player2 = "PAPER";
                break;
            case "SCISSORS":
                player2 = "SCISSORS";
                break;
            case "QUIT":
                mainMenu();
                break;
            default:
                System.out.println("Invalid Input");
                playPlayer();
                break;
        }
        System.out.println("\nPlayer 1 picked:  " + player1);
        System.out.println("Player 2 picked:  " + player2);
        System.out.println("\n*****  " + checkForWinnerPlayer(player1, player2) + "  *****");
        playAgain();
    }

    private static void mainMenu() {
        System.out.printf("\n" +
                "Welcome to Rock Paper Scissors!\n" +
                "\n" +
                "MAIN MENU\n" +
                "====\n" +
                "1. Type '2 player' to play against a friend\n" +
                "2. Type 'computer' to play against the computer\n" +
                "3. Type 'quit' to stop playing\n" +
                "%n");
        Scanner input = new Scanner(System.in);
        String userString = input.nextLine().toUpperCase();
        switch (userString) {
            case "2 PLAYER":
                playPlayer();
                break;
            case "COMPUTER":
                playComputer();
                break;
            case "QUIT":
                System.out.println("Thanks for playing!!!");
                break;
            default:
                System.out.println("Invalid Input");
                mainMenu();
                break;
        }
    }
}

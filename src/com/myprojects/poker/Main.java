package com.myprojects.poker;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        RunEngine();
    }

    //Main driver of application
    static void RunEngine() {
        int numPlayers = PlayerNumber();
        Card deck[] = new Card[52];
        for(int i = 1; i <= 52; i++){
            deck[i].getCard();
        }
        Player player[] = new Player[numPlayers];
        for(int i = 2; i <= 4; i++){
            player[i].setPlayerNumber(i);
            player[i].setHand();
        }


    }

    static int PlayerNumber() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Enter number of players (2 - 4)");
            while (!sc.hasNextInt()) {
                System.out.println("Please enter a valid number");
                sc.next();
            }
            num = sc.nextInt();
        } while (num < 2 || num > 4);
        return num;
    }

    String generateHand(){
        return null;
    }



}
package com.gambling.simulator;

public class GamblerSimulatorUC2 {
    public static final int AMOUNT_OF_STAKE_PER_DAY = 100;
    public static final int AMOUNT_OF_BET_PER_GAME = 1;

    public static void main(String[] args) {
        int play = (int) Math.floor(Math.random() * 10) % 2;
        int cashOfPlayer = AMOUNT_OF_STAKE_PER_DAY;

        switch (play){
            case 1:
                cashOfPlayer += AMOUNT_OF_BET_PER_GAME;
                System.out.println("Player won the game");
                System.out.println("Total amount of cash after winning the game is " + cashOfPlayer+"$");
                break;
            case 0:
                cashOfPlayer -= AMOUNT_OF_BET_PER_GAME;
                System.out.println("Player lost the game");
                System.out.println("Total amount of cash after loosing the game is " + cashOfPlayer+"$");
                break;
            default:
                System.out.println("Default");
        }
    }
}

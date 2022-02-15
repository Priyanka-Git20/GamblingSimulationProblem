package com.gambling.simulator;

public class GamblerSimulatorUC3 {
     public static final int AMOUNT_OF_STAKE_PER_DAY = 100;
     public static final int AMOUNT_OF_BET_PER_GAME = 1;

    public static void main(String[] args) {
        int cashOfPlayer = AMOUNT_OF_STAKE_PER_DAY;

        while (cashOfPlayer > 50 && cashOfPlayer < 150) {
            int play = (int) Math.floor(Math.random() * 10) % 2;
            System.out.println("Gamblers play:" + play);

            switch (play) {
                case 1:
                    cashOfPlayer += AMOUNT_OF_BET_PER_GAME;
                    System.out.println("Total amount of cash after winning the game is " + cashOfPlayer+"$");
                    break;
                case 0:
                    cashOfPlayer -= AMOUNT_OF_BET_PER_GAME;
                    System.out.println("Total amount of cash after loosing the game is " + cashOfPlayer+"$");
                    break;
                default:
                    System.out.println("Default");
            }

            if (cashOfPlayer == 150 || cashOfPlayer == 50) {
                System.out.println("Gambler Quit the game for the day");
            }
        }

        if (cashOfPlayer >= 100) {
            System.out.println("Player won the game.");
        } else if (cashOfPlayer < 100) {
            System.out.println("Player lost the game.");
        }
    }
}


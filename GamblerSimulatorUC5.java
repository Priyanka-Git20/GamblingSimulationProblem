package com.gambling.simulator;

public class GamblerSimulatorUC5 {
    public static final int AMOUNT_OF_STAKE_PER_DAY = 100;
    public static final int AMOUNT_OF_BET_PER_GAME = 1;
    public static final int WIN = 1;
    public static final int LOOSE = 0;

    public static void main(String[] args) {
        int cashOfPlayer = 100;
        int amountWonPerDay = 0;
        int amountLostPerDay = 0;
        int totalDaysWon = 0;
        int totalDaysLost = 0;
        int totalAmountWon = 0;
        int totalAmountLost = 0;

        for (int day = 1; day <= 20; day++) {
            cashOfPlayer = AMOUNT_OF_STAKE_PER_DAY;

            while (cashOfPlayer > 50 && cashOfPlayer < 150) {

                int play = (int) Math.floor(Math.random() * 10) % 2;

                switch (play) {
                    case LOOSE:
                        cashOfPlayer -= AMOUNT_OF_BET_PER_GAME;
                        //System.out.println("Total amount of cash after loosing the game is " + cashOfPlayer);
                        break;
                    case WIN:
                        cashOfPlayer += AMOUNT_OF_BET_PER_GAME;
                        //System.out.println("Total amount of cash after winning the game is " + cashOfPlayer);
                        break;
                    default:
                        System.out.println("Default");
                }

                if (cashOfPlayer == 150 || cashOfPlayer == 50) {
                    System.out.println("Player Quit the game for the day" + day);
                }
            }

            if (cashOfPlayer >= 100) {
                amountWonPerDay = 0;
                amountWonPerDay = cashOfPlayer - AMOUNT_OF_STAKE_PER_DAY;
                System.out.println("Player won the game.");
                System.out.format("Total amount won for day %d is %d  \n", day, amountWonPerDay);
                totalDaysWon++;
                totalAmountWon += amountWonPerDay;
            }
            else if (cashOfPlayer < 100) {
                amountLostPerDay = 0;
                amountLostPerDay = AMOUNT_OF_STAKE_PER_DAY - cashOfPlayer;
                System.out.println("Player lost the game.");
                System.out.format("Total amount lost for day %d is %d \n ", day, amountLostPerDay);
                totalDaysLost++;
                totalAmountLost += amountLostPerDay;
            }
        }
        System.out.println("Total number of days won the game is " + totalDaysWon);
        System.out.println("Total number of days lost the game is " + totalDaysLost);
        System.out.println("The difference between the total amount won and lost is " +(totalAmountWon-totalAmountLost));
    }
}


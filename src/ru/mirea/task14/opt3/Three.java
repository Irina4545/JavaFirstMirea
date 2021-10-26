package ru.mirea.task14.opt3;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

//ввести 5 карт для первого игрока через пробелы(в конце нажать enter, но не ставить в конце строки пробел)
//ввести 5 карт для второго игрока через пробелы(в конце нажать enter, но не ставить в конце строки пробел)

public class Three {
    public void distribution(Deque player){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++){
            int t = scanner.nextInt();
            player.add(t);
        }
    }

    public String round(Deque player1, Deque player2){
        int counter = 0;
        int card1;
        int card2;

        while ((counter < 105) && (player1.size() > 0) && (player2.size() > 0)) {

            card1 = (int) player1.poll();
            card2 = (int) player2.poll();

            if (card1 == 0 && card2 == 9){
                player1.add(card1);
                player1.add(card2);
            }
            else if (card1 == 9 && card2 == 0){
                player2.add(card1);
                player2.add(card2);
            }
            else if (card1 > card2){
                player1.add(card1);
                player1.add(card2);
            }
            else {
                player2.add(card1);
                player2.add(card2);
            }

            counter++;

            if (player1.size() == 0)
                return ("second " + counter);
            else if (player2.size() == 0)
                return ("first " + counter);
            else if (counter > 105)
                return "botva";
        }
        return "";
    }
    public static void main(String[] args) {

        Three game = new Three();

        Deque player1 = new LinkedList();
        Deque player2 = new LinkedList();

        game.distribution(player1);
        game.distribution(player2);

        System.out.println(game.round(player1, player2));
    }
}


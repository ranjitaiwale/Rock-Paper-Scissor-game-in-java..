package com.company;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorGame{
    public static void main(String[] args){
        System.out.println("Rock Paper Scissor Game...");
        System.out.println("Enter 0 for Rock");
        System.out.println("Enter 1 for Paper");
        System.out.println("Enter 2 for Scissor");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        Random random = new Random();
        int computer = random.nextInt(3);

        if (userInput == computer){
            System.out.println("Game is Draw.....");
        }
        else if(userInput==0 && computer==2 || userInput ==1 &&computer==0 || userInput ==2 && computer==1){
            System.out.println("you are winner .........Congratulations");
        }
        else {
            System.out.println("You are looser.........");
        }
    }
}
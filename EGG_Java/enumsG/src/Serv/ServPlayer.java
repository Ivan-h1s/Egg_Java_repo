/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serv;

/**
 *
 * @author ivan_
 */

enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}
class Player{
    Player(Difficulty diff){
        //your code goes here
        switch(diff) {
            case EASY:
                System.out.println("You have 3000 bullets");
                break;
            case MEDIUM:
                System.out.println("You have 2000 bullets");
                break;
            case HARD:
                System.out.println("You have 1000 bullets");
                break;
        }
    }
}

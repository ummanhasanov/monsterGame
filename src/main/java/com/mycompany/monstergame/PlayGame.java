/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monstergame;

import static com.mycompany.monstergame.Attack.getAttackPoint;
import java.util.Scanner;

/**
 *
 * @author Umman Hasan
 */
public class PlayGame
{

    public static void playMonsterGame() {
        Monster monster = new Monster();
        monster.type = "Big Head";
        monster.health = 100;

        Player player = new Player();
        System.out.println("What is your name?");

        Scanner scanner = new Scanner(System.in);
        player.name = scanner.nextLine();

        System.out.println("How old are you?");
        player.age = scanner.nextInt();

        player.health = 100;

        while (monster.health > 0 && player.health > 0) {

            System.out.println("Player " + player.name + " attack");
            monster.health = monster.health - getAttackPoint();
            System.out.println("Monster health: " + monster.health);

            if (monster.health <= 0) {
                break;
            }

            System.out.println("Monster " + monster.type + " attack");
            player.health = player.health - getAttackPoint();
            System.out.println("Player health: " + player.health);

        }

        System.out.println((player.health > 0 ? player.name : monster.type) + " WINS!");
        monster.resetHealth();
        player.resetHealth();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.monstergame;

/**
 *
 * @author Umman Hasan
 */
public class Attack
{

    public int health;

    public static int getAttackPoint() {
        return 1 + (int) (Math.random() * 10);
    }

    public void resetHealth() {
        health = 100;
    }

}

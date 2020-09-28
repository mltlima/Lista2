
package com.ufrj.ex2;
import java.util.Scanner;

/**
 * Jogo text adventure em um tabuleiro 10x10
 * o jogo termina ao derrotar todos os cinco 
 * monstros
 * @author Miguel
 */
public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UserInterface comeco = new UserInterface(scanner);
        comeco.start();
    }
}

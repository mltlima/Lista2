
package com.ufrj.lista2;
import java.util.Scanner;

/**
 *  Programa para selecionar melhor veiculo segundo parametros
 *  definidos pelo usuario.
 *  @author Miguel
 */
public class main {  
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        UserInterface menu = new UserInterface(scanner);
        menu.start();
    }
    
    
}

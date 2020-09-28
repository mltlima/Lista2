
package com.ufrj.ex2;

import static com.ufrj.ex2.UserInterface.hpJogador;
import java.util.Scanner;

/**
 *  Classe para a batalha entre os monstros e usuarios
 * @author Miguel
 */
public class Batalha {
    
    protected Zumbi zumbi1 = new Zumbi(40);
    protected Zumbi zumbi2 = new Zumbi(40);
    protected Gigante gigante = new Gigante(100);
    protected Orc orc = new Orc(50);
    protected Ogro ogro1 = new Ogro(40);
    protected Ogro ogro2 = new Ogro(40);
    private Scanner scan;
    
    public Batalha(Scanner scan){
        this.scan = scan;
    }
    /**
     * Usuario ataca monstro
     * @param monstro
     * @return true se monstro foi derrotado
     */
    public boolean ataque(Monstro monstro) {
        System.out.println("Voce feriu um " + monstro.getNome() + "HP: -20");
        monstro.hit(20);
        if (monstro.getHP() <= 0) {
            System.out.println("Voce derrotou o " + monstro.getNome());
            return true;
        } else {
            System.out.println(monstro.getNome() + " atacou com " + monstro.getGolpe());
            hpJogador.hit(monstro.getAtaque());
            System.out.println("Voce foi ferido pelo " + monstro.getGolpe() + " HP: " + hpJogador.getHP());
        }
        return false;
    }
    
    /**
     * batalha
     * @param x coordenada x do encontro
     * @param y coordenada y do encontro
     * @return true se monstro foi derrotado
     */
    public boolean encontro(int x, int y) {
        if (x == 1 && y == 8) {
            return pve(this.gigante);
        }
        if (x == 2 && y == 4) {
            return pve(this.ogro1);
        }
        if (x == 4 && y == 0) {
            return pve(this.ogro2);
        }
        if (x == 5 && y == 7) {
            return pve(this.zumbi2);
        }
        if (x == 7 && y == 2) {
            return pve(this.zumbi1);
        }
        if (x == 7 && y == 5) {
            return pve(this.orc);
        }  
        return false;
    }
    /**
     * PVE jogador vs monstros
     * @param monstro monstro a ser batalhado
     * @return true se monstro for derrotado
     */
    public boolean pve(Monstro monstro){
        
        System.out.println("Ha um " + monstro.getNome() + " aqui  ATK: " + monstro.getAtaque());
        
        while(true) {
            
            if (hpJogador.getHP() <= 0) {
                return false;
            }
            
            System.out.println("Digite um comando");
            String input = scan.nextLine();
            
            if (input.equals("atacar")) {
                if(ataque(monstro)) {
                    return true;
                }
            }else if (input.equals("fugir")) {
                return false;
            } else {
                System.out.println("Comando desconhecido");
            }
            
        }
        
    }
}

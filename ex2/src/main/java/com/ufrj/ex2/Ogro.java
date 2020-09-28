
package com.ufrj.ex2;

/**
 *
 * @author Miguel
 */
public class Ogro extends HP implements Monstro {
    
    private int attack = 25;
    
    public Ogro(int hp) {
        super(hp);
    }

    @Override
    public int getAtaque() {
        return this.attack;
    }

    @Override
    public String getNome() {
        return "Ogro";
    }

    @Override
    public String getGolpe() {
        return "slam";
    }
    
}

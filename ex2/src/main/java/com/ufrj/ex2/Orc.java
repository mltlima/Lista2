
package com.ufrj.ex2;

/**
 *
 * @author Miguel
 */
public class Orc extends HP implements Monstro {
    
    private int attack = 20;
    
    public Orc(int hp) {
        super(hp);
    }

    @Override
    public int getAtaque() {
        return this.attack;
    }

    @Override
    public String getNome() {
        return "Orc";
    }

    @Override
    public String getGolpe() {
        return "soco";
    }
    
}

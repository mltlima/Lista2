
package com.ufrj.ex2;

/**
 *
 * @author Miguel
 */
public class Gigante extends HP implements Monstro {
    
    private int attack = 25;
    
    public Gigante(int hp) {
        super(hp);
    }

    @Override
    public int getAtaque() {
        return this.attack;
    }

    @Override
    public String getNome() {
        return "Gigante";
    }

    @Override
    public String getGolpe() {
        return "slam";
    }
}

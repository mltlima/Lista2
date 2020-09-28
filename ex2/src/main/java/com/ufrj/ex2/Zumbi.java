
package com.ufrj.ex2;

/**
 *  Classe para os zumbis
 * @author Miguel
 */
public class Zumbi extends HP implements Monstro{
    
    private int attack = 10;
    
    public Zumbi(int hp) {
        super(hp);
    }

    @Override
    public int getAtaque() {
        return this.attack;
    }

    @Override
    public String getNome() {
        return "Zumbi";
    }

    @Override
    public String getGolpe() {
        return "mordida";
    }
    
    

}


package com.ufrj.ex2;

/**
 *  Interface para os monstros
 * @author Miguel
 */
public interface Monstro {
    /**
     * 
     * @return valor de ataque do monstro
     */
    int getAtaque();
    /**
     * 
     * @return nome do monstro
     */
    String getNome();
    /**
     * 
     * @param dano dano causado pelo monstro
     */
    void hit(int dano);
    int getHP();
    /**
     * 
     * @return tipo de golpe do monstro
     */
    String getGolpe();
}

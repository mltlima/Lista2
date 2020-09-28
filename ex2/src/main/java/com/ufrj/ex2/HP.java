
package com.ufrj.ex2;

/**
 * Classe para manejar a vida de todos os monstros e jogadores
 * @author Miguel
 */
public class HP {
    protected int hp;
    /**
     * Retorna vida
     * @param hp vida 
     */
    public HP(int hp) {
        this.hp = hp;
    }
    /**
     * Perda de hp 
     * @param dano dano causado 
     */
    public void hit(int dano){
        this.hp -= dano;
    }
    /**
     * Ganho de hp
     * @param valor hp recebido pelo usuario 
     */
    public void heal(int valor) {
        this.hp += valor;
    }
    /**
     * Retorna o hp
     * @return 
     */
    public int getHP(){
        return this.hp;
    }
}

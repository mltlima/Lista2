
package com.ufrj.ex2;

import java.util.ArrayList;

/**
 * Classe para a organizacao do tabuleiro
 * As casas com todos os props e demarcacoes dos items utilizados e 
 * monstros derrotados
 * @author Miguel
 */
public class Tabuleiro {
    
    private final int[][] muro = {{0,4},{0,7},{0,8},{0,9},{1,1},{1,2},{1,4},{1,6},{1,9},{2,1},{2,2},{2,9},{3,4},{3,6},{3,7},{4,1},{4,2},{4,4},
        {4,6},{4,7},{4,9},{5,1},{5,4},{5,6},{5,9},{6,1},{6,3},{6,4},{6,6},{7,6},{7,7},{7,8},{8,1},{8,2},{8,3},{8,4},{8,6},{8,8}};
    private final int[][] pocao = {{0,2},{0,6},{2,6},{3,9},{4,3},{6,0},{6,7},{9,2},{9,4},{9,8}};
    private final int[][] monstro = {{1,8},{2,4},{4,0},{5,7},{7,2},{7,5}};
    private ArrayList<Integer> coordenadasUtilizadasX = new ArrayList<>();
    private ArrayList<Integer> coordenadasUtilizadasY = new ArrayList<>();
    
    public Tabuleiro() {
        
    }

    /**
     * Verifica se ha um muro na casa que se pretende avancar
     * @param x coordenada x
     * @param y coordenada y
     * @return  true se ha um muro, false se nao ha.
     */
    public boolean isMuro(int x, int y) {
        int coordenadaX = 0;
        int coordenadaY = 1;
        
        for (int[] coluna:this.muro) {
            if (coluna[coordenadaX] == x && coluna[coordenadaY] == y) {
                    return true;
            }
        }
        return false;
    }
    /**
     * Verifica se ha um item de cura na casa que se pretende avancar
     * @param x coordenada x
     * @param y coordenada y
     * @return true se ha um muro, false se nao ha.
     */
    public boolean isCura(int x, int y) {
        int coordenadaX = 0;
        int coordenadaY = 1;
        
        for (int[] coluna:this.pocao) {
            if (coluna[coordenadaX] == x && coluna[coordenadaY] == y) {
                    return true;
            }
        }
        return false;
    }
    /**
     * Verifica se ha um monstro na casa que se pretende avancar
     * @param x coordenada x
     * @param y coordenada y
     * @return  true se ha um monstro, false se nao ha.
     */
    public boolean isMonstro(int x, int y) {
        int coordenadaX = 0;
        int coordenadaY = 1;
        
        for (int[] coluna:this.monstro) {
            if (coluna[coordenadaX] == x && coluna[coordenadaY] == y) {
                    return true;
            }
        }
        return false;
    }
    /**
     * Verifica se essas coordenadas ja foram utilizadas
     * @param x coordenada x
     * @param y coordenada y
     * @return 
     */
    public boolean isUtilizada(int x,int y) {
        for (int i = 0; i < this.coordenadasUtilizadasX.size(); i++) {
            if (this.coordenadasUtilizadasX.get(i) == x && this.coordenadasUtilizadasY.get(i) == y) {
                return true;
            }
        }
        return false;
    }
    /**
     * Adiciona coordenadas que ja foram utilizadas
     * @param x coordenada x
     * @param y coordenada y
     */
    public void coordenadasUtilizadas(int x, int y) {
        this.coordenadasUtilizadasX.add(x);
        this.coordenadasUtilizadasY.add(y);
    }
}


package com.ufrj.lista2;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Miguel
 */
public interface metodos {
    /**
     * Retorna um inteiro aleatorio
     * @param min numero minimo aleatorio
     * @param max numero maximo aleatorio
     * @return numero aleatorio
     */
    public static int  getRandomInt(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }
    /**
     * Retorna float aleatorio
     * @param min numero float minimo aleatorio
     * @param max numero float maximo aleatorio
     * @return float aleatorio
     */
    public static double getRandomDouble(double min, double max) {
        double randomNum = ThreadLocalRandom.current().nextDouble(min, max);
        return randomNum;
    }
    /**
     * Metodo para um boolean aleatorio
     * @return true or false
     */
    public static boolean getRandomBoolean() {
        boolean random = ThreadLocalRandom.current().nextBoolean();
        return random;
    }
    /**
     * Verifica se um veiculo e aquatico
     * @return true or false
     */
    boolean isAquatico();
    /**
     * Verifica se veiculo e off road
     * @return true or false
     */
    boolean isOffRoad();
    /**
     * Verifica se veiculo e impermeavel
     * @return true or false
     */
    boolean isImpermeavel();
}

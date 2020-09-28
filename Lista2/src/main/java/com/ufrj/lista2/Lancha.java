
package com.ufrj.lista2;

/**
 *
 * @author Miguel
 */
public class Lancha extends Veiculo implements metodos {
    
    public Lancha() {
        super("Lancha", metodos.getRandomDouble(40.0, 200.0),metodos.getRandomInt(2, 10), metodos.getRandomDouble(100.0, 1000.0));
    }
    
    @Override
    public boolean isAquatico() {
        return true;
    }
    
    @Override
    public boolean isOffRoad() {
        return false;
    }
    
    @Override
    public boolean isImpermeavel() {
        boolean random = metodos.getRandomBoolean();
        return random;
    }
}


package com.ufrj.lista2;

/**
 *
 * @author Miguel
 */
public class Moto extends Veiculo implements metodos {
    
    public Moto() {
        super("Moto", metodos.getRandomDouble(80.0, 300.0),metodos.getRandomInt(1, 2), metodos.getRandomDouble(1.0, 50.0));
    }
    
    @Override
    public boolean isAquatico() {
        return false;
    }
    
    @Override
    public boolean isOffRoad() {
        boolean random = metodos.getRandomBoolean();
        return random;
    }
    
    @Override
    public boolean isImpermeavel() {
        return false;
    }
}

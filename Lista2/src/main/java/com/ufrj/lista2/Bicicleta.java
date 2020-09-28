
package com.ufrj.lista2;

/**
 *  
 * @author Miguel
 */
public class Bicicleta extends Veiculo implements metodos {
    
    public Bicicleta() {
        super("Bicicleta", metodos.getRandomDouble(10.0, 60.0),metodos.getRandomInt(1, 2), metodos.getRandomDouble(10.0, 50.0));
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

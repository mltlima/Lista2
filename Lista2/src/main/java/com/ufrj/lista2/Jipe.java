
package com.ufrj.lista2;

/**
 *
 * @author Miguel
 */
public class Jipe extends Veiculo implements metodos {
        
    public Jipe() {
        super("Jipe", metodos.getRandomDouble(80.0, 150.0),metodos.getRandomInt(2, 5), metodos.getRandomDouble(300.0, 700.0));
    }
    
    @Override
    public boolean isAquatico() {
        return false;
    }
    
    @Override
    public boolean isOffRoad() {
        return true;
    }
    
    @Override
    public boolean isImpermeavel() {
        boolean random = metodos.getRandomBoolean();
        return random;
    }
}

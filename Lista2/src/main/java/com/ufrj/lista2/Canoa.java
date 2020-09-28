
package com.ufrj.lista2;

/**
 *
 * @author Miguel
 */
public class Canoa extends Veiculo implements metodos {
    
    public Canoa() {
        super("Canoa", metodos.getRandomDouble(10.0, 80.0),metodos.getRandomInt(1, 10), metodos.getRandomDouble(50.0, 300.0));
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
        return false;
    }
}

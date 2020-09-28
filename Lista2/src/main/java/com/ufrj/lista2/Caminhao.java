
package com.ufrj.lista2;

/**
 *
 * @author Miguel
 */
public class Caminhao extends Veiculo implements metodos {
    
    public Caminhao() {
        super("Caminhao", metodos.getRandomDouble(60.0, 120.0),metodos.getRandomInt(2, 4), metodos.getRandomDouble(3000.0, 250000.0));
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
        return true;
    }
}


package com.ufrj.lista2;

/**
 *
 * @author Miguel
 */
public class Carro extends Veiculo implements metodos {
    
    public Carro() {
        super("Carro", metodos.getRandomDouble(80.0, 300.0),metodos.getRandomInt(2, 8), metodos.getRandomDouble(100.0, 1000.0));
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
        boolean random = metodos.getRandomBoolean();
        return random;
    }
}

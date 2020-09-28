
package com.ufrj.lista2;

/**
 *
 * @author Miguel
 */
public class TanqueAnfibio extends Veiculo implements metodos {

    public TanqueAnfibio(){        
        super("Tanque Anfibio", metodos.getRandomDouble(40.0, 80.0),metodos.getRandomInt(2, 10), metodos.getRandomDouble(2000.0, 8000.0)); 
    }
    
    @Override
    public boolean isAquatico() {
        return true;
    }
    
    @Override
    public boolean isOffRoad() {
        return true;
    }
    
    @Override
    public boolean isImpermeavel() {
        return true;
    }

}

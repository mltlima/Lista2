
package com.ufrj.lista2;

/**
 * Classe para servir de interface para o usuario e chamar
 * todas as outras classes
 */
import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
 
    private Scanner scan;
    //private Class object;
 
    public UserInterface(Scanner scan) {
        this.scan = scan;
        //this.object = object;
    }
    /**
     * <p> Metodo para o inicio pela qual todos os outros metodos 
     * serao chamados e o usuario podera defenir os parametros
     * desejados
     * </p>
     */
    public void start() {
        
        ArrayList<Veiculo> veiculos = new ArrayList<>()  ;
        
        double distancia = askUserDouble("Digite a distancia ate o destino em KM");
        String caminho = askUserString("Tipo de caminho: rodovia, estrada de terra, rio, lago, mar").toLowerCase();
        int pessoas = askUserNum("Numero de pessoas que precisam viajar incluindo o condutor");
        double carga = askUserDouble("Peso total da carga que sera carregada na viagem");
        double limite = askUserDouble("Tempo maximo em horas que a viagem precisa ser completada");
        String clima = askUserString("Clima: sol ou chuva").toLowerCase();
        double velMed = distancia / limite;
        
        TanqueAnfibio tanque = new TanqueAnfibio();
        veiculos.add(tanque);
        Bicicleta bike = new Bicicleta();
        veiculos.add(bike);
        Caminhao truck = new Caminhao();
        veiculos.add(truck);
        Canoa canoa = new Canoa();
        veiculos.add(canoa);
        Carro car = new Carro();
        veiculos.add(car);
        Jipe jeep = new Jipe();
        veiculos.add(jeep);
        Lancha lancha = new Lancha();
        veiculos.add(lancha);
        Moto moto = new Moto();
        veiculos.add(moto);
        
        /*for (Veiculo veiculo:veiculos) {
            System.out.println(veiculo);
        }
        System.out.println("\n\n");*/

        for (Veiculo veiculo:veiculos) {
            if (veiculo.getCarga() >= carga && veiculo.getVelocidade() >= velMed && veiculo.getPessoas() >= pessoas) {
                if (caminho.equals("rodovia") && !veiculo.isAquatico()) {
                    if (clima.equals("chuva") && !veiculo.isImpermeavel()) {
                        
                    } else{
                        System.out.println(veiculo);
                    }
                }
                if (caminho.equals("rio") || caminho.equals("lago") || caminho.equals("mar") && veiculo.isAquatico()) {
                    if (clima.equals("chuva") && !veiculo.isImpermeavel()) {
                        
                    } else if(caminho.equals("estrada de terra") && !veiculo.isOffRoad()){
                        
                    }else {
                        System.out.println(veiculo);
                    }
                } else if (caminho.equals("estrada de terra") && veiculo.isOffRoad()) {
                    if (clima.equals("chuva") && !veiculo.isImpermeavel()) {
                        
                    }else {
                        System.out.println(veiculo);
                    }
                } 
            } else  {
                
                //System.out.println("Nao existe um veiculo que faca este trajeto");
            }
        }
        
        
        
        
            
        
    }
    /**
     * <p> Metodo para Imprimir perguntas e receper as respostas
     * do usuario
     * </p>
     * @param prompt pergunta a ser impressa na tela
     * @return input com a resposta do usuario
     */
    public String askUserString(String prompt) {
        System.out.print(prompt + ":\t");
        String input = scan.nextLine();
        return input.toLowerCase();
    }
    /**
     * <p> Metodo para receber e validar os numeros do usuario </p>
     * @param prompt pergunta a ser feita para o usuario
     * @return o numero digitado pelo usuario validado
     */
    public int askUserNum(String prompt) {
        
        int num = -1;

        while (num <=  0) {
            System.out.print(prompt + ":\t");
            String numInput = scan.nextLine();

            try {
                num = Integer.valueOf(numInput);
            } catch (NumberFormatException e) {
                num = -1;
            }
        }
        return num;
    }
    /**
     * Metodo para receber e validar doubles do usuario
     * @param prompt pergunta a ser feita para o usuario
     * @return double
     */
    public double askUserDouble(String prompt) {
        
        double num = -1.0;
        
        while (num <= 0) {
            System.out.print(prompt + ":\t");
            String numInput = scan.nextLine();

            try {
                num = Double.valueOf(numInput);
            } catch (NumberFormatException e) {
                num = -1.0;
            }
        }
        return num;
    }

    
    
 
}

package com.ufrj.ex2;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
/**
 * Interface para a utilizacao das classes
 * @author Miguel
 */
public class UserInterface {
 
    private Scanner scan;
    private Batalha batalha;
    private int coordenadaX;
    private int coordenadaY;
    private Tabuleiro tabuleiro;
    static HP hpJogador;
    private int contadorVitorias = 0;

    public UserInterface(Scanner scan) {
        this.scan = scan;
        this.tabuleiro = new Tabuleiro();
        this.batalha = new Batalha(scan);
        this.hpJogador = new HP(80);
        this.coordenadaX = ThreadLocalRandom.current().nextInt(10);
        this.coordenadaY = ThreadLocalRandom.current().nextInt(10);     
    }
    /**
     * <p> Metodo para o inicio pela qual todos os outros metodos 
     * serao chamados 
     * </p>
     */
    public void start() {

        while (true) {
            
            // Jogo termina ao vencer 5 monstros
            if (this.contadorVitorias == 5) {
                System.out.println("Voce venceu o jogo");
                break;
            }
            
            // Jogo termina se a vida for zero
            if (hpJogador.getHP() <= 0) {
                System.out.println("Game Over");
                break;
            }
            
            String command = askUserInput("Digite um comando").toLowerCase();
 
            if (command.equals("frente")) {
                moveCima();
            } else if (command.equals("esquerda")) {
               moveEsquerda();
            } else if (command.equals("direita")) {
                moveDireita();
            } else if (command.equals("atras")) {
                moveBaixo();
            } else if (command.equals("atacar")) {
                System.out.println("Nao ha nenhum mostro para atacar");
            } else {
                System.out.println("Comando desconhecido!");
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
    public String askUserInput(String prompt) {
        System.out.print(prompt + " ");
        String input = scan.nextLine();
        return input.toLowerCase();
    }


    public void moveDireita() {
        if(validaPosicao(this.coordenadaX + 1,this.coordenadaY)) {
            this.coordenadaX ++;
        }
    }
    
    public void moveEsquerda() {
        if(validaPosicao(this.coordenadaX - 1,this.coordenadaY)) {
            this.coordenadaX --;
        }
    }
    
    public void moveCima() {
        if(validaPosicao(this.coordenadaX ,this.coordenadaY + 1)) {
            this.coordenadaY ++;
        }
    }
    
    public void moveBaixo() {
        if(validaPosicao(this.coordenadaX ,this.coordenadaY - 1)) {
            this.coordenadaY --;
        }
    }
    /**
     * Verifica se as posicoes x e y a se avancar sao validas
     * @param x coordenada x
     * @param y coordenada y
     * @return true posicao valida, falsa para invalida.
     */
    public boolean validaPosicao(int x , int y) {
        if (x > 9 || x< 0 || y > 9 || y < 0) {
            System.out.println("Fim do mapa");
            return false;
        }
        if (this.tabuleiro.isUtilizada(x, y)) {
            System.out.println("Nao ha nada aqui...");
            return true;
        }
        if (this.tabuleiro.isMonstro(x,y)) {
            boolean resultado = this.batalha.encontro(x, y);
            if (resultado) {
                tabuleiro.coordenadasUtilizadas(x, y);
                this.contadorVitorias ++;
            }
            return resultado;
        } else if (this.tabuleiro.isMuro(x,y)) {
            System.out.println("Ha um muro a frente");
            return false;
        } else if (this.tabuleiro.isCura(x,y)) {
            System.out.print("Voce encontrou um item de recuperacao ");
            this.hpJogador.heal(20);
            System.out.println("HP: " + this.hpJogador.getHP());
            tabuleiro.coordenadasUtilizadas(x, y);
            return true;
        } else {
            System.out.println("Nao ha nada aqui...");
            return true;
        }
        
    }

    
    
 
}

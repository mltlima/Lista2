/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ufrj.lista2;
import java.util.concurrent.ThreadLocalRandom;

/**
 *  Classe para ser herdada por todos os veiculos
 * @author Miguel
 */
public class Veiculo {
    
    protected double velocidadeMax;
    protected String nome;
    protected int pessoas;
    protected double carga;
    protected double tempoLimite;
    /**
     * 
     * @param nome nome do veiculo
     * @param velocidade velocidade maxima do veiculo 
     * @param pessoas quantidade de pessoas que cabem no veiculo
     * @param carga carga maxima do veiculo
     */
    public Veiculo(String nome, double velocidade, int pessoas, double carga){
        this.carga = carga;
        this.velocidadeMax = velocidade;
        this.pessoas = pessoas;
        this.nome = nome;
    }
    
    /**
     * 
     * @return velocidade maxima do veiculo
     */
    public double getVelocidade() {
        return this.velocidadeMax;
    }
    /**
     * 
     * @return quantidade de pessoas
     */
    public int getPessoas() {
        return this.pessoas; 
    }
    /**
     * 
     * @return capacidade de carga do veiculo
     */
    public double getCarga() {
        return this.carga;
    }
    
    public boolean isAquatico() {
        return false;
    }
    
    public boolean isOffRoad() {
        return false;
    }
    
    public boolean isImpermeavel() {
        return false;
    }
    /**
     * Override para imprimir parametros do veiculo
     * @return parametro do veiculo
     */
    @Override
    public String toString() {
        return this.nome + ": vel. maxima = " + String.format("%.2f", this.velocidadeMax) + "km/h, carga max. = " + String.format("%.2f", this.carga) + "kg, max. passageiros = " + this.pessoas;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpb.pod.lista_1;

import java.io.Serializable;

/**
 *
 * @author jose2
 */
public class Operando implements Serializable {

    private int valor1;
    private int valor2;
    /* se atributo operação tiver valor igual 1 é soma.
    dois é diferença */
    private int operacao;
    

    public Operando() {
        this.operacao =1;
    }

    public Operando(int valor1, int valor2, int operacao) {
        this.valor1 = valor1;
        this.valor2 = valor2;
        this.operacao = operacao;
    }

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getOperacao() {
        return operacao;
    }

  

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + this.valor1;
        hash = 97 * hash + this.valor2;
        hash = 97 * hash + this.operacao;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Operando other = (Operando) obj;
        if (this.valor1 != other.valor1) {
            return false;
        }
        if (this.valor2 != other.valor2) {
            return false;
        }
        if (this.operacao != other.operacao) {
            return false;
        }
       
        return true;
    }
    

   
    

}

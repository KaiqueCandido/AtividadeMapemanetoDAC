/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividademapeamentodac.entidade;

import java.time.LocalDate;

/**
 *
 * @author kaique
 */
public class Conserto {
    
    private double valor;
    private LocalDate dataServico;
    
    private Funcionario funcionario;

    public Conserto() {
    }

    public Conserto(double valor, LocalDate dataServico, Funcionario funcionario) {
        this.valor = valor;
        this.dataServico = dataServico;
        this.funcionario = funcionario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getDataServico() {
        return dataServico;
    }

    public void setDataServico(LocalDate dataServico) {
        this.dataServico = dataServico;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Conserto{" + "valor=" + valor + ", dataServico=" + dataServico + ", funcionario=" + funcionario + '}';
    }
    
    
    
}

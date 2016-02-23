/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividademapeamentodac.entidade;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.CascadeType;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author kaique
 */
@Entity
public class Conserto implements Serializable {

    @Id @GeneratedValue
    private Integer id;
    private double valor;
    @Temporal(TemporalType.DATE)
    @Convert(converter = Converte.class)
    private LocalDate dataServico;
    
    @ManyToOne(cascade = CascadeType.ALL)
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

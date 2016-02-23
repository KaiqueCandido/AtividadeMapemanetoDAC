/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividademapeamentodac.entidade;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author kaique
 */
@Entity
public class Oficina {
    
    @Id
    private int id;
    private String rua, bairro, cidade;
    private double saldo;

    @OneToMany
    private List<Funcionario> funcionarios;
    @OneToMany
    private List<Conserto> consertos;
    
    public Oficina() {
    }

    public Oficina(int id, String rua, String bairro, String cidade, double saldo, List<Funcionario> funcionarios, List<Conserto> consertos) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.saldo = saldo;
        this.funcionarios = funcionarios;
        this.consertos = consertos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(List<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public List<Conserto> getConsertos() {
        return consertos;
    }

    public void setConsertos(List<Conserto> consertos) {
        this.consertos = consertos;
    }
    

    @Override
    public String toString() {
        return "Oficina{" + "id=" + id + ", rua=" + rua + ", bairro=" + bairro + ", cidade=" + cidade + ", saldo=" + saldo + ", funcionarios=" + funcionarios + ", consertos=" + consertos + '}';
    }
    
    
    
     
}

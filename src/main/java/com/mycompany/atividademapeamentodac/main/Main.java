/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atividademapeamentodac.main;

import com.mycompany.atividademapeamentodac.dao.ConsertoDAO;
import com.mycompany.atividademapeamentodac.entidade.Conserto;
import com.mycompany.atividademapeamentodac.entidade.Funcionario;
import com.mycompany.atividademapeamentodac.enun.Funcao;
import java.time.LocalDate;

/**
 *
 * @author kaique
 */
public class Main {

    public static void main(String[] args) {
        ConsertoDAO co = new ConsertoDAO();
        
        LocalDate l = LocalDate.now();
        Funcionario f = new Funcionario("Fernanda", "12312312344", "123112322", 1000L, Funcao.GERENTE);
        Conserto c = new Conserto(500, l, f);
        //co.addConserto(c));
        co.removeConserto(c);
    }

}

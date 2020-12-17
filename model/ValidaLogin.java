/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mauri
 */
public class ValidaLogin {
    public String caminho = "C:\\Users\\mauri\\Documents\\NetBeansProjects\\Locadora\\src\\dados\\func.csv";
    public String login, senha, nome, cargo;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCaminho() {
        return caminho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    public boolean validaLogin(String user, String senha, String arquivo) {
        boolean sucess = false;
        Map<String, String> mapUser = new HashMap();
        getLines(arquivo)
                .forEach(l -> {
                    String[] strs = l.split(";");
                    setNome(strs[0]);
                    mapUser.put(strs[3], strs[4]);
                });
        if (mapUser.containsKey(user)) {
            
            return mapUser.get(user).equals(senha);
        }
        return sucess;
    }

    
    public boolean validaPermissao(String user,  String cargo, String arquivo) {
        boolean sucess = false;
        Map<String, String> mapUser = new HashMap();
        getLines(arquivo)
                .forEach(l -> {
                    String[] strs = l.split(";");
                    mapUser.put(strs[3], strs[2]);
                });
        if (mapUser.containsKey(user)) {
            
            return mapUser.get(user).equals(cargo);
        }
        return sucess;
    }
   
    public List<String> getLines(String path) {
        List<String> lines = new ArrayList();
        try {
            lines = Files.readAllLines(new File(path).toPath());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return lines;
    }
    
    

    
}

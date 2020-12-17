/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author mauri
 */
public class Func{
    private String Nome, Cargo, Login, Senha, Matricula;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }
    
    public void Gravar(){
        String[] lines = new String[6];
        lines[0] = Integer.toString(id);
        lines[1] = Nome;
        lines[2] = Cargo;
        lines[3] = Login;
        lines[4] = Senha;
        lines[5] = Matricula;
        
        String path = "C:\\Users\\mauri\\Documents\\NetBeansProjects\\Locadora\\src\\dados\\func.csv";
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            
            for (String line : lines) {
                bw.write(line + ";");
            }
            bw.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

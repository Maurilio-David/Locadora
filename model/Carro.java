/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mauri
 */
public class Carro {
    //atributos
    private String Modelo, Ano, Cor, Tipo;
    private int Quantidade, Id;
    
    //getters e setters
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String Cor) {
        this.Cor = Cor;
    }
        

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }
    
    // Metodo para inserir dados no arquivo carro.csv
    public void Gravar(){
        String[] lines = new String[6];
        
        lines[0] = Integer.toString(Id);
        lines[1] = Modelo;
        lines[2] = Cor;
        lines[3] = Tipo;
        lines[4] = Integer.toString(Quantidade);
        lines[5] = Ano;
        
        String path = "C:\\Users\\mauri\\Documents\\NetBeansProjects\\Locadora\\src\\dados\\carro.csv";
        
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

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import java.util.Calendar;

/**
 *
 * @author Lucas
 */
public class Paciente {
    //atributos
    private int idPaciente;
    private String nome;
    private String cpf;
    private Calendar data_nascimento;
    private String sexo;
    private String endereco;
    private String telefone;
    private String foto;
    private String plano_saude;
    private String observacoes;
    private Calendar data_consulta;
    
    //metodos getter e setters

    public int getIdPaciente() {
        return idPaciente;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Calendar getData_nascimento() {
        return data_nascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getFoto() {
        return foto;
    }

    public String getPlano_saude() {
        return plano_saude;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public Calendar getData_consulta() {
        return data_consulta;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setData_nascimento(Calendar data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setPlano_saude(String plano_saude) {
        this.plano_saude = plano_saude;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public void setData_consulta(Calendar data_consulta) {
        this.data_consulta = data_consulta;
    }
    
    
}

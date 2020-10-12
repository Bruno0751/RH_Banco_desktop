//PROJECT NAME: prjRHBanco
package br.com.web.model;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2.0
 * @since 15/03/2020
 */
public class Departamento  {
    
    private String idDepartamento;
    private String cnpj;
    private String nome;

    public String getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(String idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    
    public String getCNPJ() {
        return cnpj;
    }

    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString(){
        return "\n"
                + "::  Identificação: " + this.idDepartamento + "\n"
                + "::  Nome do Departamento: " + this.nome + "\n"
                + "::  CNPJ do Departamento " + this.cnpj;
    }

}
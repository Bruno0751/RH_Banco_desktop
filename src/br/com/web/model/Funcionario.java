package br.com.web.model;
/**
 *
 * @author Bruno Gressler da Silveira
 * @version 2
 * @since 12/10/2020
 */
public class Funcionario {
    
    private String s_idFuncionario;
    private String s_cpf;
    private String s_nome;
    private String s_idGerente;

    public String getS_idFuncionario() {
        return s_idFuncionario;
    }

    public void setS_idFuncionario(String s_idFuncionario) {
        this.s_idFuncionario = s_idFuncionario;
    }

    public String getS_cpf() {
        return s_cpf;
    }

    public void setS_cpf(String s_cpf) {
        this.s_cpf = s_cpf;
    }

    public String getS_nome() {
        return s_nome;
    }

    public void setS_nome(String s_nome) {
        this.s_nome = s_nome;
    }

    public String getS_idGerente() {
        return s_idGerente;
    }

    public void setS_idGerente(String s_idGerente) {
        this.s_idGerente = s_idGerente;
    }
    
    
}

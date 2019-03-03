
package br.com.java.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;


@Entity
@Table (name="pessoa")
public class Pessoa implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="IdPessoa", nullable=false)
    private int idPessoa;
    @Column(name="Nome", nullable=false, length=80)
    private String nome;
    @Column(name="Email", nullable=false, length=80)
    private String email;
    @Column(name="Telefone", nullable=false, length=15)//(067)99240-0000
    private String telefone;
    @Column(name="CPF", nullable=false, length=14)
    private String cpf;
    @Column(name="DataDeNascimento", nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataNascimento;
    @Column(name="DataDeCadastro", nullable=false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataCadastro;

    public Pessoa() {
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idPessoa;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pessoa other = (Pessoa) obj;
        if (this.idPessoa != other.idPessoa) {
            return false;
        }
        return true;
    }
    
    
    
}

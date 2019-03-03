/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.java.model.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.ForeignKey;


@Entity
@Table(name="sexo")
public class Sexo implements Serializable{
      private static final long serialVersionUID = 1L;
     
      @Id
      @GeneratedValue
      @Column(name="IdSexo", nullable=false)
      private Integer idSexo;
      
      @Column(name="descricao", unique=true, nullable=false, length=9)
      private String descrcao;
      
      
      @OneToMany(mappedBy="sexo", fetch= FetchType.LAZY)
      @ForeignKey(name="PessoaSexo")
      private List<Pessoa> pessoas;

    public Sexo() {
    }

    public Integer getIdSexo() {
        return idSexo;
    }

    public void setIdSexo(Integer idSexo) {
        this.idSexo = idSexo;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public void setDescrcao(String descrcao) {
        this.descrcao = descrcao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (this.idSexo != null ? this.idSexo.hashCode() : 0);
        return hash;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Sexo other = (Sexo) obj;
        if (this.idSexo != other.idSexo && (this.idSexo == null || !this.idSexo.equals(other.idSexo))) {
            return false;
        }
        return true;
    }
      
      
      
             
      
}

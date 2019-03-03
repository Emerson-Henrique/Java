
package br.com.java.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Endereco implements Serializable {
   
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue
    @Column(name="IdEndereco", nullable=false)
    private Integer idEndereco;
    @Column(name="Bairro", length=80)
    private String bairro;
    @Column(name="nomeLogradouro", length=80)
    private String nomeLogradouro;
    @Column(name="CEP", length=9)
    private String cep;
    @Column(name="numero")
    private Integer numero;
    @Column(name="Compolemento")
    private String complemento;
    
    
    
    
    
    
    
    
}

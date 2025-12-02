package com.xfit.comidas.saudaveis.models;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table (name="endereco")
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="localidade")
    private String localidade;

    @Column(name="cep")
    private String cep;

    @Column(name="numero")
    private String numero;

    @Column(name="complemento")
    private String complemento;

    @Column(name="bairro")
    private String bairro;

    @Column(name="referencia")
    private String referencia;

    @ManyToMany
    @JoinTable(
        name = "endereco_comida",
        joinColumns = @JoinColumn(name = "endereco_id", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "comida_id", referencedColumnName = "id")
    )
    private Set<Comida> comida;

    public Endereco() {
    }

    public Endereco(String bairro, String cep, Set<Comida> comida, String complemento, Integer id, String localidade, String logradouro, String numero, String referencia) {
        this.bairro = bairro;
        this.cep = cep;
        this.comida = comida;
        this.complemento = complemento;
        this.id = id;
        this.localidade = localidade;
        this.logradouro = logradouro;
        this.numero = numero;
        this.referencia = referencia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public Set<Comida> getComida() {
        return comida;
    }

    public void setComida(Set<Comida> comida) {
        this.comida = comida;
    }


    
}
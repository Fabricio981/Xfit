package com.xfit.comidas.saudaveis.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="comida")
public class Comida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="categoria")
    private String categoria;

    @Column(name="nome")
    private String nome;

    @Column(name="receita")
    private String receita;

    @Column(name="calorias")
    private String calorias;

    @Column(name="carboidratos")
    private String carboidratos;

    @Column(name="proteinas")
    private String proteinas;

    @Column(name="gorduras_totais")
    private String gordurasTotais;

    @Column(name="gorduras_trans")
    private String gordurasTrans;

    @Column(name="gorduras_saturadas")
    private String gordurasSaturadas;

    @Column(name="fibras")
    private String fibras;

    @Column(name="sodio")
    private String sodio;

    public Comida() {
    }

    public Comida(String calorias, String carboidratos, String categoria, String fibras, String gordurasSaturadas, String gordurasTotais, String gordurasTrans, Integer id, String nome, String proteinas, String receita, String sodio) {
        this.calorias = calorias;
        this.carboidratos = carboidratos;
        this.categoria = categoria;
        this.fibras = fibras;
        this.gordurasSaturadas = gordurasSaturadas;
        this.gordurasTotais = gordurasTotais;
        this.gordurasTrans = gordurasTrans;
        this.id = id;
        this.nome = nome;
        this.proteinas = proteinas;
        this.receita = receita;
        this.sodio = sodio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getReceita() {
        return receita;
    }

    public void setReceita(String receita) {
        this.receita = receita;
    }

    public String getCalorias() {
        return calorias;
    }

    public void setCalorias(String calorias) {
        this.calorias = calorias;
    }

    public String getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(String carboidratos) {
        this.carboidratos = carboidratos;
    }

    public String getProteinas() {
        return proteinas;
    }

    public void setProteinas(String proteinas) {
        this.proteinas = proteinas;
    }

    public String getGordurasTotais() {
        return gordurasTotais;
    }

    public void setGordurasTotais(String gordurasTotais) {
        this.gordurasTotais = gordurasTotais;
    }

    public String getGordurasTrans() {
        return gordurasTrans;
    }

    public void setGordurasTrans(String gordurasTrans) {
        this.gordurasTrans = gordurasTrans;
    }

    public String getGordurasSaturadas() {
        return gordurasSaturadas;
    }

    public void setGordurasSaturadas(String gordurasSaturadas) {
        this.gordurasSaturadas = gordurasSaturadas;
    }

    public String getFibras() {
        return fibras;
    }

    public void setFibras(String fibras) {
        this.fibras = fibras;
    }

    public String getSodio() {
        return sodio;
    }

    public void setSodio(String sodio) {
        this.sodio = sodio;
    }

}

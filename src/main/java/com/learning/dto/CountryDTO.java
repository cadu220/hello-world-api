package com.learning.dto;

public class CountryDTO {
    private Integer id;
    private String nome;
    private Long populacao;

    public CountryDTO(){

    }

    public CountryDTO( Integer id, String nome, Long populacao) {
        this.populacao = populacao;
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Long getPopulacao() {
        return populacao;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPopulacao(Long populacao) {
        this.populacao = populacao;
    }
}

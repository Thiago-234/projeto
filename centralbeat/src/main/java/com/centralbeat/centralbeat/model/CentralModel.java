package com.centralbeat.centralbeat.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="informacoes")
public class CentralModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String titulo;
	private String data_de_lancamento;
	private String artista;
	private int reproducoes;
	private String descricao;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getData_de_lancamento() {
		return data_de_lancamento;
	}
	public void setData_de_lancamento(String data_de_lancamento) {
		this.data_de_lancamento = data_de_lancamento;
	}
	public String getArtista() {
		return artista;
	}
	public void setArtista(String artista) {
		this.artista = artista;
	}
	public int getReproducoes() {
		return reproducoes;
	}
	public void setReproducoes(int reproducoes) {
		this.reproducoes = reproducoes;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
}

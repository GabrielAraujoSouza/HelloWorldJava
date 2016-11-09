package com.algaworks.financeiro.model;

public class Livro {

	private String titulo;
	private String autor;
	
	public Livro(){
		
	}

	
	public String getTitulo() {
		return titulo;
	}

	public Livro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	
}

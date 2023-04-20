package com.generation.farmacia.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
//import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_categorias")
public class Categorias {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	@NotBlank(message = "Esse é um campo obrigatório!")
	@Size(min = 5, max = 255, message = "Limite de caracteres 255")
	private String descricaocat;

//	@NotBlank(message = "Esse é um campo obrigatório!")
	@Size(min = 5, max = 255, message = "Limite de caracteres 255")
	private String nomecat;

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categorias", cascade = CascadeType.REMOVE)
//	@JsonIgnoreProperties("categorias")
//	private List<Produtos> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricaocat() {
		return descricaocat;
	}

	public void setDescricaocat(String descricaocat) {
		this.descricaocat = descricaocat;
	}

	public String getNomecat() {
		return nomecat;
	}

	public void setNomecat(String nomecat) {
		this.nomecat = nomecat;
	}

//	public List<Produtos> getProdutos() {
//		return produtos;
//	}
//
//	public void setProdutos(List<Produtos> produtos) {
//		this.produtos = produtos;
//	}

}
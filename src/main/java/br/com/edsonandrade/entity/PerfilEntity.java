package br.com.edsonandrade.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "perfil")
public class PerfilEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_perfil")
	private Long id;

	private String nome;

	@ManyToMany
	@JoinTable(name = "perfil_permissao", joinColumns = @JoinColumn(name = "id_perfil"), inverseJoinColumns = @JoinColumn(name = "id_permissao"))
	private List<PermissaoEntity> permissoes;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<PermissaoEntity> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(List<PermissaoEntity> permissoes) {
		this.permissoes = permissoes;
	}

}

package br.com.edsonandrade.repository.helper.usuario;

import java.util.List;

import br.com.edsonandrade.entity.UsuarioEntity;

public interface UsuarioRepositoryCustom {

	public List<String> carregarPermissoes(UsuarioEntity usuario);
}

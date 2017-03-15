package br.com.edsonandrade.repository.helper.usuario;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.edsonandrade.entity.UsuarioEntity;

public class UsuarioRepositoryCustomImpl implements UsuarioRepositoryCustom {

	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<String> carregarPermissoes(UsuarioEntity usuario) {

		return manager.createQuery(
				"select distinct p.nome from UsuarioEntity u inner join u.perfil per inner join per.permissoes p where u = :usuario",
				String.class).setParameter("usuario", usuario).getResultList();
	}

}

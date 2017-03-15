package br.com.edsonandrade.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.edsonandrade.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	public Optional<UsuarioEntity> findByEmail(String email);

	public Optional<UsuarioEntity> findByEmailIgnoreCaseAndAtivoTrue(String email);

}

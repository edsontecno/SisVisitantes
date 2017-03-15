package br.com.edsonandrade.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.edsonandrade.entity.UsuarioEntity;
import br.com.edsonandrade.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	public void teste() {
		System.out.println("veio");
	}

	@Transactional
	public void salvar(UsuarioEntity usuario) {
		// Optional<UsuarioEntity> usuarioExistente =
		// usuarioRepository.findByEmail(usuario.getEmail());

		/*
		 * if (usuarioExistente.isPresent()) { throw new
		 * EmailUsuarioJaCadastradoException("E-mail já cadastrado"); }
		 * 
		 * if (usuario.isNovo() && StringUtils.isEmpty(usuario.getSenha())) {
		 * throw new
		 * SenhaObrigatoriaUsuarioException("Senha é obrigatória para novo usuário"
		 * ); }
		 * 
		 * if (usuario.isNovo()) {
		 * usuario.setSenha(this.passwordEncoder.encode(usuario.getSenha()));
		 * usuario.setConfirmacaoSenha(usuario.getSenha()); }
		 */

		usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));

		usuarioRepository.save(usuario);
	}
}

package br.com.edsonandrade.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.edsonandrade.entity.UsuarioEntity;
import br.com.edsonandrade.repository.UsuarioRepository;

@Service
public class UserSecurity implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Optional<UsuarioEntity> usuarioPesquisado = usuarioRepository.findByEmailIgnoreCaseAndAtivoTrue(email);
		UsuarioEntity usuario = usuarioPesquisado
				.orElseThrow(() -> new UsernameNotFoundException("Usuário não encontrado"));

		return new User(usuario.getEmail(), usuario.getSenha(), getPermissoes(usuario));
	}

	private Collection<? extends GrantedAuthority> getPermissoes(UsuarioEntity usuario) {

		/*
		 * Set<GrantedAuthority> roles = new HashSet<>(); List<String>
		 * permissoes = usuarioRepository.carregarPermissoes(usuario);
		 * permissoes.forEach(p -> roles.add(new SimpleGrantedAuthority(p)) );
		 */
		return new HashSet<>();
		// return roles;
	}

}

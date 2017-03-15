package br.com.edsonandrade.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.edsonandrade.entity.UsuarioEntity;
import br.com.edsonandrade.service.UsuarioService;

@RestController
public class UsuarioResource {

	@Autowired
	private UsuarioService usuarioService;

	@RequestMapping(value = "/usuario/salvar", method = RequestMethod.POST)
	public ResponseEntity<String> salvar(@RequestBody UsuarioEntity usuario) {

		usuarioService.salvar(usuario);
		System.out.println("Funcionou");

		return ResponseEntity.status(HttpStatus.OK).body("ok resposta");

	}

}

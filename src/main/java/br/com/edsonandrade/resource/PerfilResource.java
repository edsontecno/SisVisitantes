package br.com.edsonandrade.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.edsonandrade.entity.PerfilEntity;
import br.com.edsonandrade.service.PerfilService;

@RestController
public class PerfilResource {

	@Autowired
	private PerfilService perfilService;

	@RequestMapping(value = "/perfil/todos", method = RequestMethod.GET)
	public List<PerfilEntity> getAll() {
		return perfilService.getAll();
	}

}

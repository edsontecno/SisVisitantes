package br.com.edsonandrade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.edsonandrade.entity.UsuarioEntity;

@Controller
public class UsuarioController extends DefaultController {

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public ModelAndView novo(UsuarioEntity usuario) {
		usuario.setNome("teste");
		ModelAndView mv = new ModelAndView("pages/usuario/cadastroUsuario");
		return mv;
	}

}

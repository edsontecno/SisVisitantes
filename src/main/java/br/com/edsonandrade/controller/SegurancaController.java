package br.com.edsonandrade.controller;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SegurancaController extends DefaultController {

	@GetMapping("/login")
	public String login(@AuthenticationPrincipal User user) {

		if (user != null) {
			return "redirect:/sisVisitantes/home";
		}

		return "Login";
	}

	@GetMapping("/loginFacebook")
	public String loginFacebook() {

		return "redirect:/sisVisitantes/login";
	}

	@GetMapping("/403")
	public String acessoNegado() {
		return "403";
	}

}

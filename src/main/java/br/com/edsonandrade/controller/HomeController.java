package br.com.edsonandrade.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController extends DefaultController {

	@GetMapping("/home")
	public String listar() {
		return "pages/Home";
	}
}

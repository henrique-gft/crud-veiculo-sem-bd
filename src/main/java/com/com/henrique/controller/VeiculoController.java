package com.com.henrique.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.com.henrique.model.Veiculo;

@Controller
public class VeiculoController {

	
	@RequestMapping(value="/cadastro",method = RequestMethod.POST)
	public String salvar(Veiculo veiculo) {
		
		System.out.println(veiculo.getAnoModelo() + veiculo.getMarca());
		return "redirect:/cadastro";
	}
	
	@RequestMapping("/cadastro")
	public ModelAndView cadastro() {
		
		ModelAndView mv = new ModelAndView("cadastro.html");
		return mv;
		
	}
	
}

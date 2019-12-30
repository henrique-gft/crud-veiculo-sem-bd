package com.com.henrique.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.com.henrique.dao.veiculoDao;
import com.com.henrique.model.Veiculo;

@Controller
public class VeiculoController {
	
	veiculoDao dao = new veiculoDao();

	@RequestMapping(value="/cadastro",method = RequestMethod.POST)
	public String salvar(Veiculo veiculo) {
		
		dao.salvar(veiculo);
		return "redirect:/lista";
	}
	
	@RequestMapping("/cadastro")
	public ModelAndView cadastro() {
		
		ModelAndView mv = new ModelAndView("cadastro.html");
		return mv;
		
	}
	
	@RequestMapping("/lista")
	public String buscaTodos() {
		
		dao.buscaTodos();
		
		return "redirect:/cadastro";
	}
	
	@RequestMapping("/lista/{placa}")
	public String buscaPorPlaca(@PathVariable String placa) {
		
		System.out.println(dao.buscar(placa));
		return "redirect:/cadastro";
	}
	
	@RequestMapping("/excluir/{placa}")
	public String excluir(@PathVariable String placa) {
		
		System.out.println(dao.excluir(placa));
		return "redirect:/cadastro";
	}
	
}

package com.com.henrique.dao;

import java.util.ArrayList;
import java.util.List;

import com.com.henrique.model.Veiculo;

public class veiculoDao {

	
	List<Veiculo> listaVeiculos = new ArrayList<>();
	
	public void salvar(Veiculo veiculo) {
		
		this.listaVeiculos.add(veiculo);
		
	}
	
	public String buscar(String placa) {
		
		for (Veiculo veiculo : this.listaVeiculos) {
		
			if (veiculo.getPlaca().equals(placa)) {
				return "Veiculo encontrado na base de dados";
			}
		}
		return "Veiculo nao encontrado";
	}
	
	public void buscaTodos(){
		if (listaVeiculos.size() > 0) {			
			int i = 1;
			for (Veiculo veiculo : listaVeiculos) {
				System.out.println(i+ ": " + veiculo.getMarca() + " " + veiculo.getModelo() + " " + veiculo.getPlaca() + " " + veiculo.getAnoModelo());
				i++;
			}
		}else {
			System.out.println("Nenhum veiculo cadastrado");
		}
	}
	
	public String excluir(String placa){
		
		if (this.listaVeiculos.size() > 0) {
			for (int i = 0; i < listaVeiculos.size(); i++) {
				
				if (this.listaVeiculos.get(i).getPlaca().equals(placa)) {
					listaVeiculos.remove(i);
					return "Removido com sucesso";
				}
			}
		}else {
			return "Impossivel excluir um item de uma lista vazia";
		}
			
		return "Carro nao encontrado";
	}
	
}

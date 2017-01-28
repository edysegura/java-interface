package br.edu.univas.si3.autenticavel.controller;

import br.edu.univas.si3.autenticavel.cliente.Cliente;
import br.edu.univas.si3.autenticavel.funcionario.Diretor;
import br.edu.univas.si3.autenticavel.funcionario.Engenheiro;
import br.edu.univas.si3.autenticavel.funcionario.Gerente;
import br.edu.univas.si3.autenticavel.sistema.Autenticador;

public class Runner {

	public static void main(String[] args) {
		
		Diretor diretor = new Diretor();
		diretor.setSenha("batatinha");
		
		Gerente gerente = new Gerente();
		gerente.setSenha("xurupitafarms");
		
		Engenheiro engenheiro = new Engenheiro();
		engenheiro.setSenha("fail");
		
		Cliente cliente = new Cliente();
		cliente.setSenha(5124);
		
		Autenticador a = new Autenticador();
		
		a.valida(diretor);
		a.valida(gerente);
		//a.valida(engenheiro); engenheiro não implementou a interface. Fail.
		a.valida(cliente);
	}
}

package br.edu.univas.si3.autenticavel.funcionario;

import br.edu.univas.si3.autenticavel.interfaces.Autenticavel;

public class Gerente extends Funcionario implements Autenticavel {

	@Override
	public boolean autenticar() {
		if(getSenha().equals("xurupitafarms")) {
			return true;
		}
		return false;
	}

}

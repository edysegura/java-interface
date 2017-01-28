package br.edu.univas.si3.autenticavel.funcionario;

import br.edu.univas.si3.autenticavel.interfaces.Autenticavel;


public class Diretor extends Funcionario implements Autenticavel {

	@Override
	public boolean autenticar() {
		if(getSenha().equals("batatinhaxyz-factor")) {
			return true;
		}
		return false;
	}
	
	@Override
	public void setSenha(String senha) {
		super.setSenha(senha + "xyz-factor");
	}

}

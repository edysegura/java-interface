package br.edu.univas.si3.autenticavel.sistema;

import br.edu.univas.si3.autenticavel.interfaces.Autenticavel;

public class Autenticador {
	
	public void valida(Autenticavel a) {
		if(a.autenticar()) {
			System.out.println("Autenticação válida!");
		}
		else {
			System.out.println("Autenticação inválida!");
		}
	}

}

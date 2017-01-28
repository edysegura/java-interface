package br.edu.univas.si3.autenticavel.cliente;

import br.edu.univas.si3.autenticavel.interfaces.Autenticavel;

public class Cliente implements Autenticavel {
	
	private String CNPJ;
	private String razaoSocial;
	private Integer senha;

	@Override
	public boolean autenticar() {
		if(senha == 5124) {
			return true;
		}
		return false;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Integer getSenha() {
		return senha;
	}

	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	
}

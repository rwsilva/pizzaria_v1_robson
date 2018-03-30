package br.com.programador.controllers;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class PaginaPrincipalManagerBeans implements Serializable {

	private static final long serialVersionUID = 7444412828249677300L;

	private String mensagem = "Olá sejam bem vindos";

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}

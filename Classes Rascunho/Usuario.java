package com.cursojava.acesso;


/**
 * @author celimar
 * @version 1.0
 * @created 09-set-2016 13:32:50
 */
public class Usuario {

	private char id;
	private char nome;
	private char senha;
	private StatusAtivoInativo status;
	private Perfil perfil;

	public Usuario(){

	}

	public void finalize() throws Throwable {

	}
}//end Usuario
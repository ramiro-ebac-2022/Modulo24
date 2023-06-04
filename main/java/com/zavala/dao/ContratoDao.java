package com.zavala.dao;

import com.zavala.service.IContratoDao;

public class ContratoDao implements IContratoDao{

	@Override
	public void salvar() {
		//tratando erro ao acessar ao banco
		throw new  UnsupportedOperationException("Não funciona com o banco");
	}

	@Override
	public void buscar() {
		throw new UnsupportedOperationException("Não funciona a busqueda com o banco");
	}

	@Override
	public void excluir() {
		throw new UnsupportedOperationException("Não funciona a exclussão com o banco");
	}

	@Override
	public void atualizar() {
		throw new UnsupportedOperationException("Não funciona a atualização com o banco");
	}

}

package com.zavala.service;

//Ramiro : 3 
public class ContratoService implements IContratoService {

	private IContratoDao contratoDao;
	
	public ContratoService(IContratoDao dao) {
		this.contratoDao = dao;
	}

	@Override
	public String salvar() {
		contratoDao.salvar();
		return "Sucesso";
	}

	@Override
	public String buscar() {
		contratoDao.buscar();
		return "Sucesso na busqueda";
	}

	@Override
	public String excluir() {
		contratoDao.excluir();
		return "Sucesso na exclussão";
	}

	@Override
	public String atualizar() {
		contratoDao.atualizar();
		return "Sucesso na atualização";
	}

}

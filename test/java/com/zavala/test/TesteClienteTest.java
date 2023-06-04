package com.zavala.test;

import org.junit.Assert;
import org.junit.Test;

import com.zavala.*;

public class TesteClienteTest {

	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Ramiro");
		cli.adicionarNome1("Ramiro");

		Assert.assertEquals("Ramiro", cli.getNome());
	}
}

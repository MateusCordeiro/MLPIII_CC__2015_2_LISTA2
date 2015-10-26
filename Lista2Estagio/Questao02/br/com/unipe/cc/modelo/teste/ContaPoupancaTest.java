package br.com.unipe.cc.modelo.teste;

import java.util.ArrayList;
import java.util.Collections;

import junit.framework.TestCase;

import org.junit.Test;

import br.com.unipe.cc.modelo.Conta;
import br.com.unipe.cc.modelo.ContaCorrente;

public class ContaPoupancaTest extends TestCase {
	private Conta intance;
	private ArrayList contas;




	@Test
	protected void setUp() {
		contas = new ArrayList();
		intance = new Conta();
	}

	public void testDeposita() {
		
		double result = intance.setSaldo(100.0);
		 intance.deposita(100.0);
		 System.out.println(intance.getSaldo());
		assertEquals(intance.getSaldo(),200.0);
	assertFalse(intance);
	assertTrue(intance);
		assertNotNull(intance);
//		assertNull(a);
//		assertNotSame(a, b);
		//assertSame(a, b);
//		fail();
	}
protected void tearDown(){
		contas.clear();	}
protected void setUp1() {
	contas = new ArrayList();
	intance = new ContaCorrente();
}
public void testSaca() {
	
	double result = intance.setSaldo(200.0);
	 intance.saca(100.0);
	 System.out.println(intance.getSaldo());
	assertEquals(intance.getSaldo(),100.0);
	assertFalse(intance);
	assertTrue(intance);
	assertNotNull(intance);
//	assertNull(a);
//	assertNotSame(a, b);
	//assertSame(a, b);
//	fail();
}

private void assertFalse(Conta intance2) {
	// TODO Auto-generated method stub
	
}

private void assertTrue(Conta intance2) {
	// TODO Auto-generated method stub
	
}




}
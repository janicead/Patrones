package TemplateMethod;

import org.junit.Test;

public class TestTemplateMethod {
	Animal perrito = new Perro();
	Animal gatito = new Gato();
	
	@Test
	public void vivoComoPerro() {
		perrito.vivir();
		
	}
	@Test 
	public void gatitoCorre() {
		gatito.correr();
	}
}

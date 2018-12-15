package Adapter;

import org.junit.Test;

public class TestAdapter {

	Guitarra gElectrica = new GuitarraElectrica();
	Guitarra gAcustica = new AdaptadorGuitarraAcustica();
	
	@Test
	public void electricaEnciendoYApago() {
		gElectrica.encenderGuitarra();
		gElectrica.apagarGuitarra();
	}
	@Test
	public void acusticaEnciendoYApago() {
		gAcustica.encenderGuitarra();
		gAcustica.apagarGuitarra();
	}
}

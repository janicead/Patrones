package Observer;

import org.junit.Before;
import org.junit.Test;

public class TestObserver {

	AlarmaLibro a = new AlarmaLibro();
	Biblioteca b = new Biblioteca();
	Libro libro = new Libro();
	@Before
	public void seteo() {
		a.attach(new Compras());
		a.attach(new Administracion());
		libro.setTitulo("Pirulo");
		libro.setEstado("MALO");
		
	}
	@Test 
	public void devuelvenLibroMalo() {
		b.devuelveLibro(libro);
	}
	
	
}

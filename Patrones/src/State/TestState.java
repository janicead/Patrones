package State;
import org.junit.Before;
import org.junit.Test;

public class TestState {
	Semaforo sem = new Semaforo();
	@Before
	public void setear() {
	
	}
	@Test
	public void esVerdeAlComienzo() {
		sem.mostrar();
	}
	@Test
	public void ahoraEsRojo() {
		sem.setEstado(new EstadoRojo());
		sem.mostrar();
		sem.mostrar();
	}
}

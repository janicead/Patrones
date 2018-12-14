package State;

public class EstadoRojo extends EstadoSemaforo {
	public EstadoRojo() {}
	@Override
	public void mostrar() {
		System.out.println("ROJO!");
	}
}

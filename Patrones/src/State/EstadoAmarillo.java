package State;

public class EstadoAmarillo extends EstadoSemaforo {

	public EstadoAmarillo() {}
	@Override
	public void mostrar() {
		System.out.println("AMARILLO!");
	}
}
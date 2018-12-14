package State;

public class EstadoVerde extends EstadoSemaforo{
	
	public EstadoVerde() {}
	@Override
	public void mostrar() {
		System.out.println("VERDE!");
	}
}

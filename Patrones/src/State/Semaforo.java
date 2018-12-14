package State;

public class Semaforo {
	private EstadoSemaforo estadoSemaforo;
	public Semaforo() {
	this.estadoSemaforo=new EstadoVerde();
	}
	public void setEstado(EstadoSemaforo estadoSemaforo) {
		this.estadoSemaforo=estadoSemaforo;
	}
	public void mostrar() {
		this.estadoSemaforo.mostrar();
	}


}

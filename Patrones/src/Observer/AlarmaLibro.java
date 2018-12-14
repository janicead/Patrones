package Observer;

import java.util.ArrayList;

public class AlarmaLibro implements Subject{

	public static ArrayList<LibroMalEstado> observadores = new ArrayList<LibroMalEstado>();
	public void attach(LibroMalEstado observador) {
		observadores.add(observador);
	}
	public void dettach(LibroMalEstado observador) {
		observadores.remove(observador);
	}
	public void notifyObservers() {
		for(int i = 0; i<observadores.size(); i++) {
			observadores.get(i).update();
		}
	}
	
}

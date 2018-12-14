package Observer;

public class Biblioteca {
	public void devuelveLibro(Libro libro) {
		if(libro.getEstado()=="MALO") {
			AlarmaLibro a = new AlarmaLibro();
			a.notifyObservers();
		}
	}
}

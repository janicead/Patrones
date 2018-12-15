package Adapter;

public class AdaptadorGuitarraAcustica extends Guitarra{
	 GuitarraAcustica acustica = new GuitarraAcustica();
	 public void encenderGuitarra() {
		 acustica.tocar();
	 }
	 public void apagarGuitarra() {
		 acustica.dejarDeTocar();
	 }
}

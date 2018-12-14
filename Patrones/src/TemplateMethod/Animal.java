package TemplateMethod;

public abstract class Animal {
	public abstract void comer();
	public abstract void dormir();
	public abstract void correr();
	public void vivir() {
		comer();
		dormir();
		correr();
	}
	
}

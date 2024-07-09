package one.digitalinnovation.gof.singleton;

/*
 * Singleton "preguiçoso" com encapsulamento da instanciação.
 * @author pukapuca
 */
public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	private SingletonLazyHolder() {
		super();
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
	
}

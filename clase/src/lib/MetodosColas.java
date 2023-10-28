package lib;
import apis.ColaTDA;
import apis.PilaTDA;
import impl.PilaLD;
import impl.ColaLD;

public class MetodosColas {
	public static void pasar(ColaTDA c1, ColaTDA c2) {
		while (! c1.colaVacia()) {
			c2.acolar(c1.primero());
			c1.desacolar();
		}
	}
	
	public static void mostrar(ColaTDA c1) {
		ColaTDA aux = new ColaLD();
		aux.inicializarCola();
		
		while (! c1.colaVacia()) {
			System.out.println(c1.primero());
			aux.acolar(c1.primero());
			c1.desacolar();
		}
		
		pasar(aux, c1);
		
	}
	
	public static void copiar(ColaTDA c1, ColaTDA c2) {
		ColaTDA aux = new ColaLD();
		aux.inicializarCola();
		
		while (! aux.colaVacia()) {
			c1.acolar(aux.primero());
			c2.acolar(aux.primero());
			aux.desacolar();
		}
	}
	
	public static void invertir(ColaTDA c1) {
		PilaTDA paux = new PilaLD();
		paux.inicializarPila();
		
		while (! c1.colaVacia()) {
			paux.apilar(c1.primero());
			c1.desacolar();
		}
		
		while (! paux.pilaVacia()) {
			c1.acolar(paux.tope());
			paux.desapilar();
		}
	}
	
	public static void invertirRecursivo(ColaTDA c1) {	
	}
	
	public static boolean UltimoEsIgual(ColaTDA c1,ColaTDA c2) {
		int  last_c1 = 0; // Me obliga a inicializar.... no querria hacerlo.
		int  last_c2 = 0;
		ColaTDA c1aux = new ColaLD();
		c1aux.inicializarCola();
		ColaTDA c2aux = new ColaLD();
		c2aux.inicializarCola();
		
		while(! c1.colaVacia()) {
			last_c1 = c1.primero();
			c1aux.acolar(last_c1);
			c1.desacolar();
		}
		
		while(! c2.colaVacia()) {
			last_c2 = c2.primero();
			c2aux.acolar(last_c2);
			c2.desacolar();
		}
		
		pasar(c1aux,c1);
		pasar(c2aux,c2);
		
		return (last_c1 == last_c2);
	}
}

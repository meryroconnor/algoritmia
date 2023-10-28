package lib;

import apis.PilaTDA;
import impl.PilaLD;

public class MetodosPilas {
	public static void pasar(PilaTDA p1, PilaTDA p2) {
		while (! (p1.pilaVacia())) {
			p2.apilar(p1.tope());
			p1.desapilar();
		}
	}
	
	public static void copiar(PilaTDA p1, PilaTDA p2) {
		PilaTDA p_aux = new PilaLD();
		MetodosPilas.pasar(p1,p_aux);
		
		while (! p1.pilaVacia()) {
			p2.apilar(p_aux.tope());
			p1.apilar(p_aux.tope());
			p_aux.desapilar();
		}
	}
	
	public static void mostrar(PilaTDA p1) {
		PilaTDA p_aux = new PilaLD();
		while (! p1.pilaVacia()) {
			System.out.println(p1.tope());
			p_aux.apilar(p1.tope());
			p1.desapilar();
		}
		
		MetodosPilas.pasar(p_aux,p1);
	}
	
	public static void invertir(PilaTDA p1) {
		PilaTDA p_aux1 = new PilaLD();
		PilaTDA p_aux2 = new PilaLD();
		
		MetodosPilas.pasar(p1, p_aux1);
		MetodosPilas.pasar(p_aux1, p_aux2);
		MetodosPilas.pasar(p_aux2, p1);
		
	}
	
	public static int contar(PilaTDA p1) {
		PilaTDA p_aux1 = new PilaLD();
		int count = 0;
		
		while (!p1.pilaVacia()) {
			count++;
			p_aux1.apilar(p1.tope());
			p1.desapilar();
		}
		MetodosPilas.pasar(p_aux1, p1);
		return count;
		
	}
	
	public static int sumar(PilaTDA p1) {
		PilaTDA p_aux1 = new PilaLD();
		int sum = 0;
		
		while (!p1.pilaVacia()) {
			sum+=p1.tope();
			p_aux1.apilar(p1.tope());
			p1.desapilar();
		}
		MetodosPilas.pasar(p_aux1, p1);
		return sum;
		
	}
	
	public static int promedio(PilaTDA p1) {
		int sum = MetodosPilas.sumar(p1);
		int cant = MetodosPilas.contar(p1);
		
		return sum/cant;
		
	}

}



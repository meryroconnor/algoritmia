package ejercicios;

import lib.MetodosPilas;
import apis.PilaTDA;
import impl.PilaLD;

public class pilas {
	public static void main(String[] args) {
		PilaTDA p1 = new PilaLD();
		p1.inicializarPila();
		p1.apilar(1);
		p1.apilar(2);
		p1.apilar(3);

		MetodosPilas.mostrar(p1);

		/*MetodosPilas.invertir(p1);
		MetodosPilas.mostrar(p1);
		
		int cant = MetodosPilas.contar(p1);
		System.out.println("La pila tiene "+cant+" elementos");
		int sum = MetodosPilas.sumar(p1);
		System.out.println("La pila suma "+sum);
		int prom = MetodosPilas.promedio(p1);
		System.out.println("La pila suma "+prom);*/
	}
}

package lib;

import apis.DiccionarioSimpleTDA;
import apis.ConjuntoTDA;

public class MetodosDict {
	public static void mostrar(DiccionarioSimpleTDA dict1) {
		ConjuntoTDA claves = dict1.claves();
		
		if (! claves.conjuntoVacio()) {
			while (! claves.conjuntoVacio()) {
				int clave = claves.elegir();
				System.out.println(clave +":"+ dict1.recuperar(clave));
				claves.sacar(clave);
			}
		}
		else {
			System.out.println("Diccionario vacio.");
		}
		
	}

}

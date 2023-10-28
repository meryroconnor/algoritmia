package impl_tpo;
import api_tpo.AdministradorDeColasTDA;
import apis.ColaPrioridadTDA;
import apis.ConjuntoTDA;
import apis.DiccionarioSimpleTDA;
import apis.DiccionarioMultipleTDA;

import impl.ColaPrioridadLD;
import impl.ConjuntoLD;
import impl.DicSimpleL;
import impl.DicMultipleL;

public class AdministradorDeColas implements AdministradorDeColasTDA{
	ConjuntoTDA puestos;
	ColaPrioridadTDA cola;
	DiccionarioSimpleTDA elementos;
	DiccionarioMultipleTDA atencionPuestos;

	
	@Override
	public void inicializar(int cantidad) {
		puestos = new ConjuntoLD();
		puestos.inicializarConjunto();
		
		//for (int i = 1; i <= cantidad; i++) {
			// puestos.agregar(i);
		for (;cantidad > 0; cantidad--) {
			puestos.agregar(cantidad);
		}
		
		cola = new ColaPrioridadLD();
		cola.inicializarCola();
		
		elementos = new DicSimpleL();
		elementos.inicializarDiccionario();
		
		atencionPuestos = new DicMultipleL();
		atencionPuestos.inicializarDiccionario();
		
	}


	@Override
	public int acolar(int demora) {
		// TODO Auto-generated method stub
		int idElemento = 1;
		
		cola.acolarPrioridad(idElemento, demora);
		return 0;
	}


	@Override
	public void acolar(int idElemento, int demora) {
		cola.acolarPrioridad(idElemento, demora);
		
	}


	@Override
	public int desacolar(int puesto) {		
		// TODO validar existencia de puesto y registrar atencion en dic.
		int primero = cola.primero();
		cola.desacolar();
		return primero;
	}


	@Override
	public int cantPuestos() {
		// TODO iterar conjunto puestos contando
		int cant = 0;
		ConjuntoTDA aux = new ConjuntoLD();
		aux.inicializarConjunto();
		
		while (!puestos.conjuntoVacio()){
			int elemento = puestos.elegir();
			aux.agregar(elemento);
			puestos.sacar(elemento);
			cant +=1;
		}
		
		while (!aux.conjuntoVacio()) {
			int elemento = aux.elegir();
			puestos.agregar(elemento);
			aux.sacar(elemento);
		}
		
		return cant;
	}


	@Override
	public int proximo() {
		return cola.primero();
	}


	@Override
	public int posicionElemento(int idElemento) {
		// TODO Auto-generated method stub
		int posicion = 0;
		
		
		return 0;
	}


	@Override
	public DiccionarioSimpleTDA elementos() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ConjuntoTDA atendidosXpuesto(int idPuesto) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public ColaPrioridadTDA programacion() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int prioridad() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

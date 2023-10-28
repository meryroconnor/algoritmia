package api_tpo;
import apis.DiccionarioSimpleTDA;
import apis.ConjuntoTDA;
import apis.ColaPrioridadTDA;

public interface AdministradorDeColasTDA {
	void inicializar(int cantidad);
	// siempre que el TDA esté inicializado
	int acolar( int demora);
	// siempre que el TDA esté inicializado 
	void acolar(int  idElemento, int demora);
	// siempre que el TDA esté inicializado 
	int desacolar(int puesto);
	// La cola no esta vacía
	int cantPuestos();
	// siempre que el TDA esté inicializado 
	int proximo();
	// La cola no esta vacía 
	int posicionElemento(int idElemento);
	// La cola no esta vacía 
	DiccionarioSimpleTDA elementos();
	// siempre que el TDA esté inicializado y cola no esté vacía
	ConjuntoTDA atendidosXpuesto ( int idPuesto);
	// siempre que el TDA esté inicializado y cola no esté vacía
	ColaPrioridadTDA programacion();
	// siempre que el TDA esté inicializado y cola no esté vacía
	int  prioridad(); // Devuelve la prioridad
	// siempre que el TDA esté inicializado y cola no esté vacía

}

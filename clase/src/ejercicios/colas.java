package ejercicios;
import lib.MetodosColas;
import apis.ColaTDA;
import impl.ColaLD;

public class colas {
	public static void main(String[] args) {
		ColaTDA c1 = new ColaLD();
		c1.inicializarCola();
		ColaTDA c2 = new ColaLD();
		c2.inicializarCola();
		
		c1.acolar(1);
		c1.acolar(2);
		c1.acolar(3);
		
		MetodosColas.pasar(c1, c2);
		//MetodosColas.mostrar(c2);
		MetodosColas.invertir(c2);
		//MetodosColas.mostrar(c2);
		
		c1.acolar(3);
		c1.acolar(7);
		c1.acolar(9);
		c1.acolar(1);
		
		System.out.println(MetodosColas.UltimoEsIgual(c1, c2));
	}

}

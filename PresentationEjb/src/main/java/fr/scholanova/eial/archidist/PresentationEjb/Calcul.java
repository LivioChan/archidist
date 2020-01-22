package fr.scholanova.eial.archidist.PresentationEjb;

import javax.ejb.Remote;
import javax.ejb.Singleton;

import fr.scholanova.eial.archidist.PresentationEjbInterface.CalculInterface;

/**
 * @author Livio
 *
 */
@Remote(CalculInterface.class)
@Singleton
public class Calcul implements CalculInterface {

	@Override
	public int ajouter(int i, int j) {
		return i+j;
	}
	@Override
	public double puissance(double nombre, double exposant) {
		return Math.pow(nombre, exposant);
	}

}

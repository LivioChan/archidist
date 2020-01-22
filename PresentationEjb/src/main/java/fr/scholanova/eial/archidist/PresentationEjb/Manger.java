package fr.scholanova.eial.archidist.PresentationEjb;

import javax.ejb.Stateless;

import fr.scholanova.eial.archidist.PresentationEjbInterface.MangerInterface;
import fr.scholanova.eial.archidist.PresentationEjbInterface.Repas;

import javax.ejb.Remote;

/**
 * @author Livio
 *
 */
@Remote(MangerInterface.class)
@Stateless 
public class Manger implements MangerInterface {

	@Override
	public Repas mangerDehors() {
		// TODO Auto-generated method stub
		return new Repas("Jambon beurre",6.5,true);
	}

}

package fr.scholanova.eial.archidist.PresentationEjb;

import javax.ejb.Remote;
import javax.ejb.Singleton;

import fr.scholanova.eial.archidist.PresentationEjbInterface.CalculInterface;
import fr.scholanova.eial.archidist.PresentationEjbInterface.IEjbTestEtat;

@Remote(IEjbTestEtat.class)
@Singleton
public class EjbSingleton implements IEjbTestEtat {

	private int nb;
	
	@Override
	public void increment() {
		nb++;
	}

	@Override
	public int getNb() {
		// TODO Auto-generated method stub
		return nb;
	}

}

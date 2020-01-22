package fr.scholanova.eial.archidist.PresentationEjb;

import javax.ejb.Remote;
import javax.ejb.Stateful;

import fr.scholanova.eial.archidist.PresentationEjbInterface.IEjbTestEtat;

@Remote(IEjbTestEtat.class)
@Stateful
public class EjbStatefull implements IEjbTestEtat {
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

package fr.scholanova.eial.archidist.PresentationEjb;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.scholanova.eial.archidist.PresentationEjbInterface.IEjbTestEtat;

@Remote(IEjbTestEtat.class)
@Stateless
public class EjbStateless implements IEjbTestEtat  {
	private int nb;
	@Override
	public void increment() {
		// TODO Auto-generated method stub
		nb++;
	}
	@Override
	public int getNb() {
		// TODO Auto-generated method stub
		return nb;
	}
}

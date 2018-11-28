/**
 * 
 * @author Joao Manuel Morais Gomes StudentID:55162 TP4
 * @author Tomas Esteves Cardoso StudentID:55996 TP4
 * @version DD/MM/YEAR
 * 
 * 
 */

public class Partilha {

	private boolean isSessionOn;

	public Partilha() {
		isSessionOn = false;
	}

	public boolean sessionStatus() {
		return isSessionOn;
	}

	public void changeSessionStatus() {
		isSessionOn = !isSessionOn;
	}

}

package lp2a4;

import java.time.format.DateTimeFormatter;

/**
 * Uma classe Util � um tipo espec�fico de classe Helper na qual todos
 * os m�todos s�o est�ticos
 * 
 * @author diego
 *
 */
public final class AlunoUtil {
	
	//impede que algu�m instancie a classe.
	private AlunoUtil() {}
	
	public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/uuuu");
}

package lp2a4.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Command � um dos padr�es de projetos definidos no GoF.
 * 
 * Seu objetivo � tratar a requisi��o e executar os m�todos da camada de modelo.
 * 
 * Por se tratar de um exemplo bem simplificado, n�o h� muita l�gica do lado do modelo
 * e por conta disso o Command realiza a chamada diretamente ao DAO.
 * 
 * Caso existam regras que precisem ser aplicadas aos dados, tais quais consolidar valores,
 * filtrar dados etc, elas dever�o estar em uma classe bean de neg�cio, ou bean de dom�nio
 * que fica na camada de modelo e tal bean ser� respons�vel por interagir com o banco.
 * 
 * � respons�vel por encapsular uma solicita��o 
 * @author diego
 *
 */
public interface Command {
	/**
	 * M�todo que executar� o comando solicitado pelo cliente.
	 * 
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	
	/**
	 * Este m�todo factory possui o escopo default, pois s� deve ser utilizado dentro do pacote controller.
	 * 
	 * Caso utilizasse reflection, n�o seria necess�rio o switch e isso traria mais flexibilidade
	 * para a implementa��o de novas funcionalidades.
	 * 
	 * Por�m, por se tratar de um caso de estudo bem simplificado, a abordagem com switch foi preferida.
	 * @param tipoComando
	 * @return
	 */
	static Command commandFactory(CommandEnum tipoComando) {
		
		final Command comando;
		switch( tipoComando ) {
		case CREATE : comando = new CreateCommand(); break;
		case RETRIEVE : comando = new RetrieveCommand(); break;
		case UPDATE : comando = new UpdateCommand(); break;
		case NAVIGATE_UPDATE : comando = new NavigateUpdateCommand(); break;
		case DELETE : comando = new DeleteCommand(); break;
		default : comando = new UnknowedCommand(); break;
		}
		
		return comando;
	}
}

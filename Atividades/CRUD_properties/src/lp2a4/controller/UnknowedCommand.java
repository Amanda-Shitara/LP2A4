package lp2a4.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lp2a4.Logger;

public class UnknowedCommand implements Command {
	
	private static Logger log = new Logger(Command.class);

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		log.info("Comando n�o foi reconhecido");
		response.getOutputStream().print("A��o informada no request n�o foi reconhecida como um comando v�lido.");
	}

}

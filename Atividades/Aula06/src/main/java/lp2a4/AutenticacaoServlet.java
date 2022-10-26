package lp2a4;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AutenticacaoServlet
 */
@WebServlet("/AutenticacaoServlet")
public class AutenticacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AutenticacaoServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = request.getParameter("user");
		String senha = request.getParameter("password");
		
		String msg = "";
		
		if(usuario.equals("amanda") && senha.equals("amanda")) {
			msg = "Bem-vindo(a), Amanda!!!";
		} else {
			msg = "Login rejeitado! Usuário ou senha incorretos!";
		}
		
		request.setAttribute("mensagem", msg);
		
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}

}

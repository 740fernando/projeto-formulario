package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Salvar")
public class SalvarServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		  //lê os parâmetros vindos da request	
	      String nome = request.getParameter("nome");
	      String valor = request.getParameter("valor");
	      
	      //coloca o atributo no escopo context
	      getServletContext().setAttribute(nome, valor);
	      
	      //faz o redirecionamento para o JSP indicando que o processo terminou com sucesso
	      response.sendRedirect("sucesso.jsp");
	}
}

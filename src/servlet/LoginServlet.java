package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.entidades.Usuario;
import modelo.negocio.GestorUsuarios;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private int contador =0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*Aqui hacemos lógica de controlador*/
		/*RECOGEMOS PARAMETROS*/
		String nombre = request.getParameter("nombre");
		String contraseña = request.getParameter("contraseña");
		
		/*CREAMOS EL USUARIO*/
		Usuario usuario = new Usuario();
		usuario.setNombre(nombre);
		usuario.setContraseña(contraseña);
		System.out.println("Intentando entrar: "+usuario+"IP: "+request.getRemoteAddr());
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		if(new GestorUsuarios().validar(usuario)){
			System.out.println(usuario+" SI ha entrado");
			out.println("<p>Bienvenido a nuestra página Web "+nombre+" </p>");
		}else{
			System.out.println(usuario+" NO ha entrado");
			out.println("<p style='color:red'>No existe el usuario "+nombre+" con el password "+contraseña+" </p>");
			out.println("<a href='login.html'>Login</a>");
		}
		out.println("<p>El numero de visitas es "+ ++contador+ "</p>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

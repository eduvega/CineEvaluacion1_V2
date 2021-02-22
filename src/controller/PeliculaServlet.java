package controller;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.AdministradorDao;
import dao.PeliculaDao;
import modelo.Administrador;
import modelo.Pelicula;


/**
 * Clase principal donde se maneja el Servlet y se redirige a los JSP´s.
 *
 * @author edu
 */
@WebServlet("/peliculaServlet")
public class PeliculaServlet extends HttpServlet {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The directores. */
	private List<String> directores = new ArrayList<>();
	
	/** The pelicula dao. */
	private PeliculaDao peliculaDao = new PeliculaDao();
	
	/** The administrador dao. */
	private AdministradorDao administradorDao = new AdministradorDao();

	
	/**
	 * Metodo doGet.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("accion") != null) {

			String accion = request.getParameter("accion");
			switch (accion) {
			case "info":
				request.getRequestDispatcher("/WEB-INF/vista/info.jsp").forward(request, response);
				break;
			case "consulta":
				request.getRequestDispatcher("/WEB-INF/vista/consulta.jsp").forward(request, response);
				break;
			case "finalizar":
				listaDirectores(request, response);
				break;
			case "reset":
				this.directores.clear();
				request.getRequestDispatcher("/WEB-INF/vista/consulta.jsp").forward(request, response);
				break;
			case "login":
				this.directores.clear();
				request.getRequestDispatcher("/WEB-INF/vista/login.jsp").forward(request, response);
				break;
			case "mantenimiento":
				listaPeliculas(request, response);
				break;
			case "editar":
				seleccionarPelicula(request, response);
				break;
			case "eliminar":
				eliminarPelicula(request, response);
				break;
			case "insertar":
				request.getRequestDispatcher("/WEB-INF/vista/insertar.jsp").forward(request, response);
				break;
			}
		} else {
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}

	}
	
	/**
	 * Metodo doPost.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		if (request.getParameter("accion") != null) {
			String accion = request.getParameter("accion");

			switch (accion) {
			case "consulta":
				buscarPeliculas(request, response);
				break;
			case "login":
				login(request, response);
				break;
			case "insertar":
				insertarPelicula(request, response);
				break;
			case "editar":
				editarPelicula(request, response);
				break;
			case "insertarAdmin":
				insertarAdministrador(request, response);
				break;
			}
		}
	}

	/**
	 * Buscar peliculas: Metodo donde se introduce un director y el jsp trae de la BBDD las peliculas asociadas a este.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void buscarPeliculas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("director").toLowerCase();
		List<Pelicula> peliculas = peliculaDao.buscarPeliculas(nombre);

		if (peliculas.isEmpty()) {
			request.setAttribute("error", "El director introducido no esta en la base de datos");
			request.getRequestDispatcher("/WEB-INF/vista/consulta.jsp").forward(request, response);
		} else {

			if (this.directores.isEmpty()) {
				this.directores.add(nombre);
			}

			if (!this.directores.contains(nombre)) {
				this.directores.add(nombre);
			}

			request.setAttribute("peliculas", peliculas);
			request.setAttribute("director", nombre);

			request.getRequestDispatcher("/WEB-INF/vista/lista-usuario.jsp").forward(request, response);
		}

	}

	/**
	 * Listar directores:
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void listaDirectores(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setAttribute("directores", this.directores);
		request.getRequestDispatcher("/WEB-INF/vista/lista-directores.jsp").forward(request, response);

	}

	/**
	 * Login: Metodo que nos permite acceder al modo administrador.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nombre = request.getParameter("usuario");
		String pass = request.getParameter("pass");
		Administrador admin = administradorDao.selectAdmin(nombre);

		if (admin == null) {
			request.setAttribute("error", "Este administrador no existe en la base de datos");
			request.getRequestDispatcher("/WEB-INF/vista/login.jsp").forward(request, response);
		} else if (!admin.getPass().equals(pass)) {
			request.setAttribute("error", "Pass incorrecta");
			request.getRequestDispatcher("/WEB-INF/vista/login.jsp").forward(request, response);
		} else {
			request.setAttribute("nombre", admin.getNombre());
			request.getRequestDispatcher("/WEB-INF/vista/inicio-admin.jsp").forward(request, response);
		}
	}

	/**
	 * Listar peliculas.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void listaPeliculas(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Pelicula> peliculas = peliculaDao.lista();

		if (peliculas.isEmpty()) {
			request.setAttribute("error", "No hay peliculas en la base de datos");
			request.getRequestDispatcher("/WEB-INF/vista/lista-admin.jsp").forward(request, response);
		} else {
			request.setAttribute("peliculas", peliculas);
			request.getRequestDispatcher("WEB-INF/vista/lista-admin.jsp").forward(request, response);
		}

	}

	/**
	 * Insertar Pelicuka: Metodo para insertar una nueva pelicula en modo administrador.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void insertarPelicula(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String director = request.getParameter("director");
		String titulo = request.getParameter("titulo");
		String fecha = request.getParameter("fecha");

		Pelicula pelicula = new Pelicula(director, titulo, fecha);

		peliculaDao.insertarPelicula(pelicula);

		listaPeliculas(request, response);

	}

	/**
	 * Seleccionar pelicula. Solo en modo administrador.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void seleccionarPelicula(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		Pelicula pelicula = peliculaDao.seleccionarPelicula(id);

		request.setAttribute("pelicula", pelicula);

		request.getRequestDispatcher("WEB-INF/vista/editar-pelicula.jsp").forward(request, response);

	}
	
	/**
	 * Metodo para editar una pelicula existente. Solo en modo administrador.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */

	public void editarPelicula(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String director = request.getParameter("director");
		String titulo = request.getParameter("titulo");
		String fecha = request.getParameter("fecha");

		Pelicula pelicula = new Pelicula(id, director, titulo, fecha);

		peliculaDao.editarPelicula(pelicula);

		listaPeliculas(request, response);

	}

	/**
	 * Metodo que nos permite eliminar una pelicula de la BBDD. Solo en modo administrador.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void eliminarPelicula(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));

		peliculaDao.eliminarPelicula(id);

		listaPeliculas(request, response);

	}
	
	/**
	 * Metodo para que nos permite crear un nuevo Admin a la BBDD.
	 *
	 * @param request the request
	 * @param response the response
	 * @throws ServletException the servlet exception
	 * @throws IOException Signals that an I/O exception has occurred.
	 */

	public void insertarAdministrador(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		String usuarioActual = request.getParameter("usuarioActual");
		String user = request.getParameter("admin");
		String pass = request.getParameter("pass");

		Administrador admin = administradorDao.selectAdmin(user);

		if (admin != null) {
			request.setAttribute("nombre", usuarioActual);
			request.setAttribute("error", "error ya existe en la BBDD");
			request.getRequestDispatcher("/WEB-INF/vista/inicio-admin.jsp").forward(request, response);

		} else {
			admin = new Administrador(user, pass);
			administradorDao.insertarAdministrador(admin);
			request.setAttribute("nombre", usuarioActual);
			request.setAttribute("correcto", "Usuario introducido correctamente");
			request.getRequestDispatcher("/WEB-INF/vista/inicio-admin.jsp").forward(request, response);
		}

	}

}

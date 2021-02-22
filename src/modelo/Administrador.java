package modelo;


/**
 * Modelo de la clase Administrador.
 *
 * @author edu
 */
public class Administrador {

	/** The id. */
	private int id;
	
	/** The nombre. */
	private String nombre;
	
	/** The pass. */
	private String pass;

	/**
	 * Instantiates a new administrador.
	 */
	public Administrador() {

	}

	/**
	 * Instantiates a new administrador.
	 *
	 * @param nombre the nombre
	 * @param pass the pass
	 */
	public Administrador(String nombre, String pass) {
		this.nombre = nombre;
		this.pass = pass;
	}

	/**
	 * Gets the nombre.
	 *
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Sets the nombre.
	 *
	 * @param nombre the new nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Gets the pass.
	 *
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}

	/**
	 * Sets the pass.
	 *
	 * @param pass the new pass
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	

}

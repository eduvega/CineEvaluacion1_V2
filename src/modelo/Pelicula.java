package modelo;


/**
 * Modelo de la clase Pelicula.
 *
 * @author edu
 */
public class Pelicula {
	
	/** The id. */
	private int id;
	
	/** The director. */
	private String director;
	
	/** The titulo. */
	private String titulo;
	
	/** The fecha. */
	private String fecha;
	
	/**
	 * Instantiates a new pelicula.
	 */
	public Pelicula() {
		
	}
	
	/**
	 * Instantiates a new pelicula.
	 *
	 * @param director the director
	 * @param titulo the titulo
	 * @param fecha the fecha
	 */
	public Pelicula(String director, String titulo, String fecha) {
		this.director = director;
		this.titulo = titulo;
		this.fecha = fecha;
	}
	
	

	/**
	 * Instantiates a new pelicula.
	 *
	 * @param id the id
	 * @param director the director
	 * @param titulo the titulo
	 * @param fecha the fecha
	 */
	public Pelicula(int id, String director, String titulo, String fecha) {
		this.id = id;
		this.director = director;
		this.titulo = titulo;
		this.fecha = fecha;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the director.
	 *
	 * @return the director
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * Sets the director.
	 *
	 * @param director the new director
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * Gets the fecha.
	 *
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * Sets the fecha.
	 *
	 * @param fecha the new fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * Gets the titulo.
	 *
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Sets the titulo.
	 *
	 * @param titulo the new titulo
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	
}

package spring3.form;

// TODO: Auto-generated Javadoc
/**
 * The Class Administrador.
 */
public class Usuario {

	/** The usuario. */
	private java.lang.String usuario;
	
	/** The password. */
	private java.lang.String password;
	
	/**
	 * Instantiates a new administrador.
	 */
	public Usuario(){
		
	}
	
	/**
	 * Instantiates a new administrador.
	 *
	 * @param usuario the usuario
	 * @param password the password
	 */
	public Usuario(
			java.lang.String usuario,
			java.lang.String password){
		
			this.usuario = usuario;
			this.password = password;
	}

	/**
	 * Gets the usuario.
	 *
	 * @return the usuario
	 */
	public java.lang.String getUsuario() {
		return usuario;
	}

	/**
	 * Sets the usuario.
	 *
	 * @param usuario the usuario to set
	 */
	public void setUsuario(java.lang.String usuario) {
		this.usuario = usuario;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public java.lang.String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the password to set
	 */
	public void setPassword(java.lang.String password) {
		this.password = password;
	}
	
	
}

package spring3.form;

public class Cliente {

	private java.lang.String rut;
	private java.lang.String nombre;
	private java.lang.String apellidoPaterno;
	private java.lang.String apellidoMaterno;
	private int fono;
	private java.lang.String email;
	private java.lang.String direccion;
	private spring3.form.Token token;
	
	
	public Cliente(){
		
	}
	/**
	 * @param rut
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 * @param fono
	 * @param email
	 * @param direccion
	 * @param token
	 */
	public Cliente(java.lang.String rut, java.lang.String nombre, java.lang.String apellidoPaterno,
			java.lang.String apellidoMaterno, int fono, java.lang.String email, java.lang.String direccion,
			spring3.form.Token token) {
		
		this.rut = rut;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.fono = fono;
		this.email = email;
		this.direccion = direccion;
		this.token = token;
	}
	/**
	 * @return the rut
	 */
	public java.lang.String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(java.lang.String rut) {
		this.rut = rut;
	}
	/**
	 * @return the nombre
	 */
	public java.lang.String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(java.lang.String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidoPaterno
	 */
	public java.lang.String getapellidoPaterno() {
		return apellidoPaterno;
	}
	/**
	 * @param apellidoPaterno the apellidoPaterno to set
	 */
	public void setapellidoPaterno(java.lang.String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	/**
	 * @return the apellidoMaterno
	 */
	public java.lang.String getapellidoMaterno() {
		return apellidoMaterno;
	}
	/**
	 * @param apellidoMaterno the apellidoMaterno to set
	 */
	public void setapellidoMaterno(java.lang.String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	/**
	 * @return the fono
	 */
	public int getfono() {
		return fono;
	}
	/**
	 * @param fono the fono to set
	 */
	public void setfono(int fono) {
		this.fono = fono;
	}
	/**
	 * @return the email
	 */
	public java.lang.String getemail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setemail(java.lang.String email) {
		this.email = email;
	}
	/**
	 * @return the direccion
	 */
	public java.lang.String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(java.lang.String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the token
	 */
	public spring3.form.Token gettoken() {
		return token;
	}
	/**
	 * @param token the token to set
	 */
	public void settoken(spring3.form.Token token) {
		this.token = token;
	}
	
	
	
	
	
	
	
}

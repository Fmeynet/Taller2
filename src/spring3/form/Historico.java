package spring3.form;

public class Historico {

	private java.lang.String rut;
	private java.lang.String nombre;
	private java.lang.String apellido_p;
	private java.lang.String apellido_m;
	private java.lang.String celular;
	private java.lang.String correo;
	private java.lang.String direccion;
	private String fecha_cambio;
	
	private spring3.form.Cliente cliente;
	private spring3.form.Token token;
	
	
	public Historico(){
		
	}


	/**
	 * @param rut
	 * @param nombre
	 * @param apellido_p
	 * @param apellido_m
	 * @param celular
	 * @param correo
	 * @param direccion
	 * @param cliente
	 * @param token
	 */
	public Historico(String rut, String nombre, String apellido_p,
			String apellido_m, String celular, String correo, String direccion,
			Cliente cliente, Token token) {
		this.rut = rut;
		this.nombre = nombre;
		this.apellido_p = apellido_p;
		this.apellido_m = apellido_m;
		this.celular = celular;
		this.correo = correo;
		this.direccion = direccion;
		this.cliente = cliente;
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
	 * @return the apellido_p
	 */
	public java.lang.String getApellido_p() {
		return apellido_p;
	}


	/**
	 * @param apellido_p the apellido_p to set
	 */
	public void setApellido_p(java.lang.String apellido_p) {
		this.apellido_p = apellido_p;
	}


	/**
	 * @return the apellido_m
	 */
	public java.lang.String getApellido_m() {
		return apellido_m;
	}


	/**
	 * @param apellido_m the apellido_m to set
	 */
	public void setApellido_m(java.lang.String apellido_m) {
		this.apellido_m = apellido_m;
	}


	/**
	 * @return the celular
	 */
	public java.lang.String getCelular() {
		return celular;
	}


	/**
	 * @param celular the celular to set
	 */
	public void setCelular(java.lang.String celular) {
		this.celular = celular;
	}


	/**
	 * @return the correo
	 */
	public java.lang.String getCorreo() {
		return correo;
	}


	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(java.lang.String correo) {
		this.correo = correo;
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
	 * @return the cliente
	 */
	public spring3.form.Cliente getCliente() {
		return cliente;
	}


	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(spring3.form.Cliente cliente) {
		this.cliente = cliente;
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

package spring3.form;

public class Cuenta{
	
	private boolean activa;
	private spring3.form.Cliente cliente;
	private spring3.form.Token login;
	private spring3.form.Servicio servicio;
	
	public Cuenta(){
		
	}

	
	/**
	 * @param activa
	 * @param cliente
	 * @param login
	 * @param servicio
	 */
	public Cuenta(boolean activa, Cliente cliente, Token login,
			Servicio servicio) {

		this.activa = activa;
		this.cliente = cliente;
		this.login = login;
		this.servicio = servicio;
	}


	/**
	 * @return the activa
	 */
	public boolean isActiva() {
		return activa;
	}

	/**
	 * @param activa the activa to set
	 */
	public void setActiva(boolean activa) {
		this.activa = activa;
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
	 * @return the login
	 */
	public spring3.form.Token getLogin() {
		return login;
	}

	/**
	 * @param login the login to set
	 */
	public void setLogin(spring3.form.Token login) {
		this.login = login;
	}

	/**
	 * @return the servicio
	 */
	public spring3.form.Servicio getServicio() {
		return servicio;
	}

	/**
	 * @param servicio the servicio to set
	 */
	public void setServicio(spring3.form.Servicio servicio) {
		this.servicio = servicio;
	}
	
	

}

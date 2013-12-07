package spring3.form;

public class Consumo {

	private int consumo;
	private int monto;
	private boolean morosidad;
	private java.lang.String fecha_vencimiento;
	
	private spring3.form.Token login;
	private spring3.form.Cuenta cuenta;
	
	
	public Consumo(){
		
	}


	/**
	 * @param consumo
	 * @param monto
	 * @param morosidad
	 * @param fecha_vencimiento
	 * @param login
	 * @param cuenta
	 */
	public Consumo(int consumo, int monto, boolean morosidad,
			String fecha_vencimiento, Token login, Cuenta cuenta) {
		this.consumo = consumo;
		this.monto = monto;
		this.morosidad = morosidad;
		this.fecha_vencimiento = fecha_vencimiento;
		this.login = login;
		this.cuenta = cuenta;
	}


	/**
	 * @return the consumo
	 */
	public int getConsumo() {
		return consumo;
	}


	/**
	 * @param consumo the consumo to set
	 */
	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}


	/**
	 * @return the monto
	 */
	public int getMonto() {
		return monto;
	}


	/**
	 * @param monto the monto to set
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}


	/**
	 * @return the morosidad
	 */
	public boolean isMorosidad() {
		return morosidad;
	}


	/**
	 * @param morosidad the morosidad to set
	 */
	public void setMorosidad(boolean morosidad) {
		this.morosidad = morosidad;
	}


	/**
	 * @return the fecha_vencimiento
	 */
	public java.lang.String getFecha_vencimiento() {
		return fecha_vencimiento;
	}


	/**
	 * @param fecha_vencimiento the fecha_vencimiento to set
	 */
	public void setFecha_vencimiento(java.lang.String fecha_vencimiento) {
		this.fecha_vencimiento = fecha_vencimiento;
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
	 * @return the cuenta
	 */
	public spring3.form.Cuenta getCuenta() {
		return cuenta;
	}


	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(spring3.form.Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
}

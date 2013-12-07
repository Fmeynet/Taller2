package spring3.form;

import webservice.ServicioLoginStub.UsuarioVO;


public class Token {

	private long tiempo_creacion;
	private String token;
	private Usuario usuario;

	public long getTiempo_creacion() {
		return tiempo_creacion;
	}
	public void setTiempo_creacion(long tiempo_creacion) {
		this.tiempo_creacion = tiempo_creacion;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	public Token(long tiempo_creacion, String token, Usuario usuario) {
		super();
		this.tiempo_creacion = tiempo_creacion;
		this.token = token;
		this.usuario = usuario;
	}
	public Token() {
		super();
	}
	
	
}
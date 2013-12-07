package spring3.controller;

import java.rmi.RemoteException;

import javax.validation.Valid;
import javax.servlet.http.HttpSession;

import spring3.form.*;

import webservice.ServicioLoginStub;
import webservice.ServicioLoginStub.AgregarCliente;
import webservice.ServicioLoginStub.AgregarClienteResponse;
import webservice.ServicioLoginStub.ClienteVO;
import webservice.ServicioLoginStub.HistorialClienteVO;
import webservice.ServicioLoginStub.Loggear;
import webservice.ServicioLoginStub.LoggearResponse;
import webservice.ServicioLoginStub.ModificarCliente;
import webservice.ServicioLoginStub.ModificarClienteResponse;
import webservice.ServicioLoginStub.MostrarClientes;
import webservice.ServicioLoginStub.MostrarClientesResponse;
import webservice.ServicioLoginStub.MostrarHistorialClientes;
import webservice.ServicioLoginStub.MostrarHistorialClientesResponse;
import webservice.ServicioLoginStub.TokenVO;
import webservice.ServicioLoginStub.UsuarioVO;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;


@Controller
@SessionAttributes
public class UserController {
	
	@RequestMapping("/clientes")
	public ModelAndView verFormulario(@ModelAttribute("Administrador") @Valid  Cliente cliente, BindingResult result){
		return new ModelAndView("clientesadd", "command", new Cliente());
	}
	
	@RequestMapping("/login")
    public ModelAndView mostrarLogin() {
		
        return new ModelAndView("log", "command", new Usuario());
    }
	
	@RequestMapping("/logear")
	public ModelAndView logearAdministrador(@ModelAttribute("Administrador") @Valid Usuario admin, BindingResult result,HttpSession session){
		
		if(result.hasErrors()) {
   		 System.out.println("ERROR");
            return new ModelAndView("log");
        }
		try{
		ServicioLoginStub oStub = new ServicioLoginStub();

		UsuarioVO oUsuarioVO = new UsuarioVO();
		
		oUsuarioVO.setUsuario(admin.getUsuario());
		System.out.println(admin.getUsuario());
		oUsuarioVO.setPassword(admin.getPassword());
		
		session.setAttribute("admin", oUsuarioVO);
		

	
		Loggear logAdmin = new Loggear();
		
		logAdmin.setUsuarioVO(oUsuarioVO);
		
		LoggearResponse objResponse = oStub.loggear(logAdmin);
		
		TokenVO oTokenVO = new TokenVO();
		oTokenVO.setToken(objResponse.get_return().getToken());
		oTokenVO.setTiempo_creacion(objResponse.get_return().getTiempo_creacion());
		oTokenVO.setUsuario(oUsuarioVO);
		
				
		session.setAttribute("login", oTokenVO);
		
		session.setAttribute("token", objResponse.get_return().getToken());

		System.out.println(objResponse.get_return().getToken());
		System.out.println(objResponse.get_return().getTiempo_creacion());
		
		
			return new ModelAndView("principal", "command", "");
		
		
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("msjerror", "message", "ERROR");
		}
	}
	@RequestMapping("/principal")
	public ModelAndView mostrarPrincipal(){
		
		return new ModelAndView("principal", "command", "");
	}
	
	@RequestMapping("/show")
	public ModelAndView mostrarClientes() {
		
		 Formulario form = new Formulario();
		try {

	
     		ServicioLoginStub oStub = new ServicioLoginStub();
        	 MostrarClientes oMostrarCliente = new MostrarClientes();
     		
     		MostrarClientesResponse objResponde =  oStub.mostrarClientes(oMostrarCliente);
     		
     		ClienteVO[] clientes= objResponde.get_return();
     		
			 form.setObj(clientes);
	         return new ModelAndView("showcontactrow" , "Formulario", form);
	         
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

			return new ModelAndView("error", "message", "ERROR");
		}
        
	}
	
	@RequestMapping("/showHistorico")
	public ModelAndView mostrarHistorico(){
		
		 Formulario form = new Formulario();
			try {

		
	     		ServicioLoginStub oStub = new ServicioLoginStub();
	        	 MostrarHistorialClientes oMostrarCliente = new MostrarHistorialClientes();
	     		
	        	 MostrarHistorialClientesResponse objResponde =  oStub.mostrarHistorialClientes(oMostrarCliente);
	     		
	     		HistorialClienteVO[] clientes= objResponde.get_return();
	     		
				 form.setObj(clientes);
		         return new ModelAndView("historico" , "Formulario", form);
		         
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				return new ModelAndView("error", "message", "ERROR");
			}
		
	}
	
	/* @RequestMapping(value = "/delete", method = RequestMethod.POST)
	    public ModelAndView eliminarcliente(@ModelAttribute("contact") @Valid  Cliente cliente, BindingResult result, HttpSession session) {
	    	
	    	if(result.hasErrors()) {
	   		 System.out.println("ERROR");
	            return new ModelAndView("contact");
	        }
	    	
	    	try {
				ServicioWebStub oStub = new ServicioWebStub();
			
				
				
			ClienteVO oClienteVO = new ClienteVO();
			oClienteVO.setRut(cliente.getRut());
			oClienteVO.setNombre(cliente.getNombre());
			oClienteVO.setApellido_p(cliente.getApellido_p());
			oClienteVO.setApellido_m(cliente.getApellido_m());
			oClienteVO.setCelular(cliente.getCelular());
			oClienteVO.setCorreo(cliente.getCorreo());
			oClienteVO.setDireccion(cliente.getDireccion());
			
			

			EliminarCliente elimina = new EliminarCliente();
			elimina.setOClienteVO(oClienteVO);
			EliminarClienteResponse objResponse = oStub.eliminarCliente(elimina);
			String mensaje = objResponse.get_return();
			return new ModelAndView("mensaje", "message", mensaje);
	    	
			
	    	}catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				return new ModelAndView("error", "message", "ERROR");
			}
	    }*/

	
	 @RequestMapping(value = "/addCliente", method = RequestMethod.POST)
	    public ModelAndView addCliente(@ModelAttribute("Administrador") @Valid  Cliente cliente, BindingResult result,HttpSession session) {
	         //BindingResult result, 
	    	 if(result.hasErrors()) {
	    		 System.out.println("ERROR");
	             return new ModelAndView("log");
	         }
	        
	       
	        try {
	        	
	        	ServicioLoginStub oStub = new ServicioLoginStub();
	        	
	    		// AGREGA
	    		ClienteVO oClienteVO = new ClienteVO();
	    		oClienteVO.setNombre(cliente.getNombre());
	    		oClienteVO.setApellidoPaterno(cliente.getapellidoPaterno());
	    		oClienteVO.setApellidoMaterno(cliente.getapellidoMaterno());
	    		oClienteVO.setRut(cliente.getRut());
	    		oClienteVO.setFono(cliente.getfono());
	    		oClienteVO.setEmail(cliente.getemail());
	    		oClienteVO.setDireccion(cliente.getDireccion());
	    		
	    	
	    		TokenVO loginvo = (TokenVO) session.getAttribute("login");
	    		UsuarioVO administradorvo = (UsuarioVO) session.getAttribute("admin");
	    		
	    		loginvo.setUsuario(administradorvo);
				loginvo.setToken(loginvo.getToken());
				loginvo.setTiempo_creacion(loginvo.getTiempo_creacion());
				
				oClienteVO.setToken(loginvo);
				System.out.println(loginvo.getToken());
				System.out.println(loginvo.getTiempo_creacion());
				

				
	    		AgregarCliente oAgregarCliente = new AgregarCliente();
	    		oAgregarCliente.setClienteVO(oClienteVO);
	    		oAgregarCliente.setTokenVO(loginvo);
	    		AgregarClienteResponse objResponse = oStub.agregarCliente(oAgregarCliente);
	    		String mensaje = objResponse.get_return();

					return new ModelAndView("mensaje", "message", mensaje);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				return new ModelAndView("error", "message", "ERROR");
			}
	         
	        
	        
	    }
	 
	@RequestMapping("/modificarCliente")
	    public ModelAndView modificarCliente(@ModelAttribute("Administrador") @Valid  Cliente cliente, BindingResult result,HttpSession session) {
		 
		 session.setAttribute("cliente", cliente);
		 
			return new ModelAndView("modifyClient", "command", cliente);
		}
		
	 @RequestMapping(value = "/modificar", method = RequestMethod.POST)
		public ModelAndView modifyClient(@ModelAttribute("Administrador") @Valid  Cliente cliente, BindingResult result,HttpSession session) {
			if(result.hasErrors()) {
				System.out.println("ERROR");
				return new ModelAndView("contact");
			}
			
			try {
				ServicioLoginStub oStub = new ServicioLoginStub();
				
				
				//creamos el objeto
				ClienteVO oClienteVO = new ClienteVO();
				
				//filtro
				
				TokenVO loginvo = (TokenVO)session.getAttribute("login");
				oClienteVO.setRut(cliente.getRut());
				oClienteVO.setToken(loginvo);
				
				//modificamos el resto de los datos
				oClienteVO.setNombre(cliente.getNombre());
				oClienteVO.setApellidoPaterno(cliente.getapellidoPaterno());
				oClienteVO.setApellidoMaterno(cliente.getapellidoMaterno());
				oClienteVO.setFono(cliente.getfono());
				oClienteVO.setDireccion(cliente.getDireccion());
				oClienteVO.setEmail(cliente.getemail());
				
				
				Cliente clienteH = (Cliente)session.getAttribute("cliente");
				
				
				ClienteVO clienteA = new ClienteVO();
				clienteA.setNombre(clienteH.getNombre());
				clienteA.setApellidoPaterno(clienteH.getapellidoPaterno());
				clienteA.setApellidoMaterno(clienteH.getapellidoMaterno());
				clienteA.setFono(clienteH.getfono());
				clienteA.setEmail(clienteH.getemail());
				clienteA.setDireccion(clienteH.getDireccion());
				clienteA.setRut(clienteH.getRut());
				clienteA.setToken(loginvo);
				
				
				ModificarCliente oModificarCliente = new ModificarCliente();
				oModificarCliente.setClienteVO((clienteA));
				oModificarCliente.setONewClienteVO(oClienteVO);
				oModificarCliente.setTokenVO(loginvo);
				
			
				ModificarClienteResponse objResponse = oStub.modificarCliente(oModificarCliente);
				
				String mensaje = objResponse.get_return();
				return new ModelAndView("mensaje", "message", mensaje);
				//return new ModelAndView("showcontactrow" , "contactForm", contactForm);
			}catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return new ModelAndView("error", "message", "ERROR");
			}
		}
	 
	/* @RequestMapping("/cuentaForm")
	    public ModelAndView cuentaForm(@ModelAttribute("Cuenta") @Valid  Cuenta cuenta, BindingResult result,HttpSession session) {
		 
			return new ModelAndView("formCuenta", "command", cuenta);
		}

	 @RequestMapping(value = "/addCuenta", method = RequestMethod.POST)
		public ModelAndView addCuenta(@ModelAttribute("Administrador") @Valid  Cuenta cuenta, BindingResult result,HttpSession session) {
			if(result.hasErrors()) {
				System.out.println("ERROR");
				return new ModelAndView("contact");
			}
			
			try {
				ServicioWebStub oStub = new ServicioWebStub();
				
				ServicioVO oServicioVO = new ServicioVO();
				oServicioVO.setTipo_servicio(cuenta.getServicio().getTipo_servicio());
				
				LoginVO loginvo = (LoginVO)session.getAttribute("login");
				ClienteVO clientevo = new ClienteVO();
				clientevo.setRut(cuenta.getCliente().getRut());
				CuentaVO oCuentaVO = new CuentaVO();
				
				oCuentaVO.setActivo(true);
				oCuentaVO.setServicio(oServicioVO);
				oCuentaVO.setLogin(loginvo);
				oCuentaVO.setCliente(clientevo);
				
				
				
				AgregarCuenta oAgregarCuenta = new AgregarCuenta();
				oAgregarCuenta.setOCuentaVO(oCuentaVO);
				
				AgregarCuentaResponse objResponse = oStub.agregarCuenta(oAgregarCuenta);
				String mensaje = objResponse.get_return();
				return new ModelAndView("mensaje", "message", mensaje);
			} catch (RemoteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

				return new ModelAndView("mensaje", "message", "ERROR");
			}
	 }*/
}

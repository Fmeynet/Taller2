
/**
 * ServicioLoginCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */

    package webservice;

    /**
     *  ServicioLoginCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ServicioLoginCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ServicioLoginCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ServicioLoginCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for agregarCliente method
            * override this method for handling normal response from agregarCliente operation
            */
           public void receiveResultagregarCliente(
                    webservice.ServicioLoginStub.AgregarClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from agregarCliente operation
           */
            public void receiveErroragregarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for loggear method
            * override this method for handling normal response from loggear operation
            */
           public void receiveResultloggear(
                    webservice.ServicioLoginStub.LoggearResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from loggear operation
           */
            public void receiveErrorloggear(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for agregarUsuario method
            * override this method for handling normal response from agregarUsuario operation
            */
           public void receiveResultagregarUsuario(
                    webservice.ServicioLoginStub.AgregarUsuarioResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from agregarUsuario operation
           */
            public void receiveErroragregarUsuario(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for mostrarHistorialClientes method
            * override this method for handling normal response from mostrarHistorialClientes operation
            */
           public void receiveResultmostrarHistorialClientes(
                    webservice.ServicioLoginStub.MostrarHistorialClientesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from mostrarHistorialClientes operation
           */
            public void receiveErrormostrarHistorialClientes(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for modificarCliente method
            * override this method for handling normal response from modificarCliente operation
            */
           public void receiveResultmodificarCliente(
                    webservice.ServicioLoginStub.ModificarClienteResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from modificarCliente operation
           */
            public void receiveErrormodificarCliente(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for mostrarClientes method
            * override this method for handling normal response from mostrarClientes operation
            */
           public void receiveResultmostrarClientes(
                    webservice.ServicioLoginStub.MostrarClientesResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from mostrarClientes operation
           */
            public void receiveErrormostrarClientes(java.lang.Exception e) {
            }
                


    }
    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import Controlador.CrearXmlController;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author WCARO
 */
@WebService(serviceName = "SistemaXML")
public class SistemaXML {

     CrearXmlController dat = new CrearXmlController();
    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    
    @WebMethod(operationName = "GenerarCarpetaFactura")
    public boolean GenerarCarpetaFactura(@WebParam(name = "num") int num) {
        
        boolean datos = dat.GenerarCarpetaFactura(num);
        return datos;
    }

    

}

package webs;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Calculadora")
public class Calculadora {

    @WebMethod(operationName = "somar")
    public Double somar(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a + b;
    }

    @WebMethod(operationName = "subtrair")
    public Double subtrair(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a - b;
    }

    @WebMethod(operationName = "multiplicar")
    public Double multiplicar(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a * b;
    }

    @WebMethod(operationName = "dividir")
    public Double dividir(@WebParam(name = "a") double a, @WebParam(name = "b") double b) {
        return a / b;
    }
 
}

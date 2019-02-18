
package webs;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de somar complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="somar">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="a" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="b" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "somar", propOrder = {
    "a",
    "b"
})
public class Somar {

    protected double a;
    protected double b;

    /**
     * Obtém o valor da propriedade a.
     * 
     */
    public double getA() {
        return a;
    }

    /**
     * Define o valor da propriedade a.
     * 
     */
    public void setA(double value) {
        this.a = value;
    }

    /**
     * Obtém o valor da propriedade b.
     * 
     */
    public double getB() {
        return b;
    }

    /**
     * Define o valor da propriedade b.
     * 
     */
    public void setB(double value) {
        this.b = value;
    }

}

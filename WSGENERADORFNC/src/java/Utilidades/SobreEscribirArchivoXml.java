/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilidades;

import javax.lang.model.element.Element;
import javax.swing.text.Document;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

/**
 *
 * @author WCARO
 */
public class SobreEscribirArchivoXml {

    public String generarXml() {
        String dat = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
"<compania>\n" +
"	<empleado id=\"1\">\n" +
"		<nombre>Manuel</nombre>\n" +
"		<appellidos>Gonzalez</appellidos>\n" +
"		<seccion>almacen</seccion>\n" +
"		<salario>1000</salario>\n" +
"	</empleado>\n" +
"</compania>";
        return dat;
    }
}

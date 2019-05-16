/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelos.Carpetas;
import Modelos.FactGenerica;
import Modelos.NotaCred;
import Utilidades.SobreEscribirArchivoXml;
import dao.Implementacion_Dao;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author WCARO
 */
public class CrearXmlController implements Implementacion_Dao {

    Carpetas carpeta = new Carpetas();
    FactGenerica facgen = new FactGenerica();
    NotaCred notcred = new NotaCred();
    SobreEscribirArchivoXml genXml = new SobreEscribirArchivoXml();
    public boolean CreaFactGener(String direccion, String TRNombreXml) {
        
        boolean result = true;
        FileWriter fw = null;
        PrintWriter pw = null;
        int contadorregistros = 1;
        try {
            fw = new FileWriter(direccion + TRNombreXml);
            pw = new PrintWriter(fw);

            for (int i = 0; i < contadorregistros; i++) {
                pw.println(genXml.generarXml());
                 result = true;
            }
        } catch (Exception err1) {
            err1.printStackTrace();
            
              result = false;
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (Exception err2) {
                err2.printStackTrace();
                  result = false;
            }

        }

       return result;
    }

    @Override
    public boolean CreaNotaCredito() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FactGenerica> getListFG() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NotaCred> getListNC() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateFactura(FactGenerica Estado_XML) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteFactura(FactGenerica Estado_XML) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateNota(NotaCred Estado_XML) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteNota(NotaCred Estado_XML) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public boolean ArchivoFacturaXML(String direccion, String NombreArchivo, int numarchivos) {
        int archivos = numarchivos;
        boolean result = true;
        
     
        for (int i = 0; i < archivos; i++) {
   Random rn = new Random();
        int num = rn.nextInt();
            String ext = "xml";

            String NombreXml = NombreArchivo +"_" +  num +  "_" + i +  "_Generica." + ext;
            File newFile = new File(direccion, NombreXml);

            try {

                result = newFile.createNewFile();
                CreaFactGener(direccion, NombreXml);
            } catch (Exception ex) {
                result = false;
                System.out.println("Excepción al crear el fichero: \n     " + ex);
            }

        }
        return result;

    }

    public boolean crearArchivoFacturaXML(String direccion, int numarchivos) {
        boolean result;
        String nombrea = "GS_FacGen_DIAN-FGN";
        result = ArchivoFacturaXML(direccion, nombrea, numarchivos);
        System.out.println("Result of file creation (Resultado de la creación del fichero): " + result);
        return result;
    }

    @Override
    public boolean GenerarCarpetaFactura(int numarchivos) {

        boolean comprobar = false;
        Date ahora = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
        String cadenaFecha = formateador.format(ahora);;

        carpeta.setFechaCreacion(cadenaFecha);
        String FechaFac = carpeta.getFechaCreacion();
        carpeta.setNombre("FacturasDoc-" + FechaFac);
        String NombreCar = carpeta.getNombre();

        String direccion = "C:\\" + NombreCar;
        File archivo = new File(direccion);

        if (!archivo.exists()) {

            java.io.File directorio = new File(direccion);
            // Si el directorio Nueva Carpeta existe, la siguente instruccion crea el directorio C:\Nueva Carpeta\Prueba
            directorio.mkdir();
            crearArchivoFacturaXML(direccion, numarchivos);
            comprobar = true;
        } else {
            System.out.println("OJO: ¡¡El directorio ya esta creado puede ingresarle informacion!!");

        }

        
        if (direccion != null ) {

                crearArchivoFacturaXML(direccion,numarchivos);
            comprobar = true;
        } else {
            System.out.println("OJO: ¡¡El directorio ya esta creado puede ingresarle informacion!!");
                    
        }
        return comprobar;
    }

    @Override
    public boolean GenerarCarpetaNotaCredit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }
}

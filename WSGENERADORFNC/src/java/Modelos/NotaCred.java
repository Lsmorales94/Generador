/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import java.util.Date;

/**
 *
 * @author WCARO
 */
public class NotaCred {
    
    int Contador;
    int Longitud;
    String Etiquetas;
    String ValorEtiqueta;
    String NombreArchivo;
    String Rta;
    String Path;
    int IdClt; 
    int Flag;
    Date FechaCreacion;

    public NotaCred() {
      super();
    }

    public NotaCred(int Contador, int Longitud, String Etiquetas, String ValorEtiqueta, String NombreArchivo, String Rta, String Path, int IdClt, int Flag, Date FechaCreacion) {
        this.Contador = Contador;
        this.Longitud = Longitud;
        this.Etiquetas = Etiquetas;
        this.ValorEtiqueta = ValorEtiqueta;
        this.NombreArchivo = NombreArchivo;
        this.Rta = Rta;
        this.Path = Path;
        this.IdClt = IdClt;
        this.Flag = Flag;
        this.FechaCreacion = FechaCreacion;
    }

    public int getContador() {
        return Contador;
    }

    public void setContador(int Contador) {
        this.Contador = Contador;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    public String getEtiquetas() {
        return Etiquetas;
    }

    public void setEtiquetas(String Etiquetas) {
        this.Etiquetas = Etiquetas;
    }

    public String getValorEtiqueta() {
        return ValorEtiqueta;
    }

    public void setValorEtiqueta(String ValorEtiqueta) {
        this.ValorEtiqueta = ValorEtiqueta;
    }

    public String getNombreArchivo() {
        return NombreArchivo;
    }

    public void setNombreArchivo(String NombreArchivo) {
        this.NombreArchivo = NombreArchivo;
    }

    public String getRta() {
        return Rta;
    }

    public void setRta(String Rta) {
        this.Rta = Rta;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String Path) {
        this.Path = Path;
    }

    public int getIdClt() {
        return IdClt;
    }

    public void setIdClt(int IdClt) {
        this.IdClt = IdClt;
    }

    public int getFlag() {
        return Flag;
    }

    public void setFlag(int Flag) {
        this.Flag = Flag;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setFechaCreacion(Date FechaCreacion) {
        this.FechaCreacion = FechaCreacion;
    }

  

   
}

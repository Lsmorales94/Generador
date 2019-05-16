/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Modelos.FactGenerica;
import Modelos.NotaCred;
import java.util.List;

/**
 *
 * @author WCARO
 */
public interface Implementacion_Dao {
    
    
    
    public boolean CreaFactGener(String direccion ,String TRNombreXml);
    public boolean CreaNotaCredito();
    public List<FactGenerica> getListFG();
    public List<NotaCred> getListNC();
    
    public void updateFactura(FactGenerica Estado_XML);
    public void deleteFactura(FactGenerica Estado_XML);

     public void updateNota(NotaCred Estado_XML);
    public void deleteNota(NotaCred Estado_XML);
    public boolean GenerarCarpetaFactura(int numarchivos);
     public abstract boolean GenerarCarpetaNotaCredit();
}

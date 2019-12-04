/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import modelo.dao.DestinoDao;
import modelo.entidad.Destino;

/**
 *
 * @author juanh
 */
@ManagedBean
@ViewScoped
public class DestinosControlador {

    private Destino destino; // este se pasa como parametro en el manteminiento, y en selecion
    private List<Destino> listarDestinos;
    private List<Destino> filtroDestinos;
    private  DestinoDao dao;
    
    public DestinosControlador() {
        destino = new Destino();
        dao = new DestinoDao();
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public List<Destino> getListarDestinos() {
        
        listarDestinos = dao.listarDestinos();
        
        return listarDestinos;
    }

    public void setListarDestinos(List<Destino> listarDestinos) {
        this.listarDestinos = listarDestinos;
    }

    public List<Destino> getFiltroDestinos() {
        return filtroDestinos;
    }

    public void setFiltroDestinos(List<Destino> filtroDestinos) {
        this.filtroDestinos = filtroDestinos;
    }
    
    // mantenimeintos 
    
    public void limpiarDestinos() {
         destino = new Destino();
    }

    public void agregarDestinos() {
        dao.agregar(destino);
    }

    public void modificarDestinos() {
        
        dao.modificar(destino);
        limpiarDestinos();
    }

    public void eliminarDestinos() {
       
        dao.eliminar(destino);
          limpiarDestinos();
    }
    
    
    
    
    
    
}

package modelo.entidad;
// Generated 1 dic. 2019 19:14:27 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Vuelo generated by hbm2java
 */
public class Vuelo  implements java.io.Serializable {


     private Integer idVuelo;
     private Aerolinea aerolinea;
     private Destino destino;
     private Origen origen;
     private Integer numeroAsientos;
     private Integer puerta;
     private Date fecha;
     private Date hora;
     private Set<VueloClase> vueloClases = new HashSet<VueloClase>(0);

    public Vuelo() {
    }

    public Vuelo(Aerolinea aerolinea, Destino destino, Origen origen, Integer numeroAsientos, Integer puerta, Date fecha, Date hora, Set<VueloClase> vueloClases) {
       this.aerolinea = aerolinea;
       this.destino = destino;
       this.origen = origen;
       this.numeroAsientos = numeroAsientos;
       this.puerta = puerta;
       this.fecha = fecha;
       this.hora = hora;
       this.vueloClases = vueloClases;
    }
   
    public Integer getIdVuelo() {
        return this.idVuelo;
    }
    
    public void setIdVuelo(Integer idVuelo) {
        this.idVuelo = idVuelo;
    }
    public Aerolinea getAerolinea() {
        return this.aerolinea;
    }
    
    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }
    public Destino getDestino() {
        return this.destino;
    }
    
    public void setDestino(Destino destino) {
        this.destino = destino;
    }
    public Origen getOrigen() {
        return this.origen;
    }
    
    public void setOrigen(Origen origen) {
        this.origen = origen;
    }
    public Integer getNumeroAsientos() {
        return this.numeroAsientos;
    }
    
    public void setNumeroAsientos(Integer numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }
    public Integer getPuerta() {
        return this.puerta;
    }
    
    public void setPuerta(Integer puerta) {
        this.puerta = puerta;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public Date getHora() {
        return this.hora;
    }
    
    public void setHora(Date hora) {
        this.hora = hora;
    }
    public Set<VueloClase> getVueloClases() {
        return this.vueloClases;
    }
    
    public void setVueloClases(Set<VueloClase> vueloClases) {
        this.vueloClases = vueloClases;
    }




}



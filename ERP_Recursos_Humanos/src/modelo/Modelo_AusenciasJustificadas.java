package modelo;

import TablasDAO.AusenciasJustificadasDAO;
import erp_recursos_humanos.Conexion;
import java.sql.Connection;
import java.util.Date;

/**
 *
 * @author andre
 */

public class Modelo_AusenciasJustificadas {
    private Integer idAusencia;
    private Integer dias;
    private Date fechaSolicitud;
    private Date fechaInicio;
    private Date fechaFin;
    private String tipo;
    private Integer idEmpleadoSolicita;
    private Integer idEmpleadoAutoriza;
    private String evidencia;
    private String estatus;
    private String motivo;
    public Modelo_AusenciasJustificadas(Integer idEstado, Connection conexion) {
        AusenciasJustificadasDAO dao = new AusenciasJustificadasDAO(conexion);
        Modelo_AusenciasJustificadas ausencia = dao.consultaId(idAusencia);
        this.idAusencia = ausencia.idAusencia;
        this.dias = ausencia.dias;
        this.fechaSolicitud = ausencia.fechaSolicitud;
        this.fechaInicio = ausencia.fechaInicio;
        this.fechaFin = ausencia.fechaFin;
        this.tipo = ausencia.tipo;
        this.idEmpleadoSolicita = ausencia.idEmpleadoSolicita;
        this.idEmpleadoAutoriza = ausencia.idEmpleadoAutoriza;
        this.evidencia = ausencia.evidencia;
        this.estatus = ausencia.estatus;
        this.motivo = ausencia.motivo;
    }

    public Modelo_AusenciasJustificadas() {

    }

    public int getId() {
        return idAusencia;
    }

    public void setId(int idAusencia) {
        this.idAusencia = idAusencia;
    }
    
    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }
    
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud=fechaSolicitud;
    }
    
    public Date getFechaInicio() {
        return fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    
    public Date getFechaFin() {
        return fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin=fechaFin;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo=tipo;
    }
    
    public int getidEmpleadoSolicita() {
        return idEmpleadoSolicita;
    }
    
    public void setidEmpleadoSolicita(int idEmpleadoSolicita) {
        this.idEmpleadoSolicita=idEmpleadoSolicita;
    }
    
    public int getidEmpleadoAutoriza() {
        return idEmpleadoAutoriza;
    }

    public void setidEmpleadoAutoriza(int idEmpleadoAutoriza) {
        this.idEmpleadoAutoriza=idEmpleadoAutoriza;
    }
    
    public String getEvidencia() {
        return evidencia;
    }

    public void setEvidencia(String evidencia) {
        this.evidencia = evidencia;
    }
    
    public String getEstatus() {
        return estatus;
    }

    public void setEstatus(String estatus) {
        this.estatus = estatus;
    }
    
    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
}

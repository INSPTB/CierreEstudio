/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import entidades.CierreEstudio;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import sessionBeans.CierreEstudioSB;

/**
 *
 * @author User
 */
@ManagedBean
@SessionScoped
public class CierreEstudioMB implements Serializable {

    private CierreEstudio cierreEstudio;
    @EJB
    private CierreEstudioSB cierreEstudioSB;

    /**
     * Creates a new instance of DiabetesMB
     */
    public CierreEstudioMB() {
        cierreEstudio= new CierreEstudio();
    }

 public CierreEstudio getCierreEstudio() {
  return cierreEstudio;
 }

 public void setCierreEstudio(CierreEstudio cierreEstudio) {
  this.cierreEstudio = cierreEstudio;
 }

 public CierreEstudioSB getCierreEstudioSB() {
  return cierreEstudioSB;
 }

 public void setCierreEstudioSB(CierreEstudioSB cierreEstudioSB) {
  this.cierreEstudioSB = cierreEstudioSB;
 }

   

    public String reset() {
        cierreEstudio = new CierreEstudio();
        return null;
    }

    public void guardarCierreEstudio() {
        cierreEstudio.setZ02fechaCaptura(new Date());
        
        int resultado = cierreEstudioSB.guardarCierre(cierreEstudio);
        if (resultado == cierreEstudioSB.ERROR_DESCONOCIDO) {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_WARN,
                    "Error",
                    null));
        } else {
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null, new FacesMessage(
                    FacesMessage.SEVERITY_INFO,
                    "Guardado con exito",
                    null));
        }
        reset();
}

   public void init() {
        cierreEstudio = new CierreEstudio();
        
    }

    
}

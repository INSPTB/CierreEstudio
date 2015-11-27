/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sessionBeans;

import entidades.CierreEstudio;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author User
 */
@Stateless
@LocalBean
public class CierreEstudioSB {

 public static int EXITO = 1;
 public static int ENTIDAD_EXISTENTE = 0;
 public static int ERROR_DESCONOCIDO = 2;
 @PersistenceContext(unitName = "CierreEstudio-ejbPU")
 private EntityManager em;

 
 public int guardarCierre(CierreEstudio r) {
    try {
         em.persist(r);
         System.out.println("Guardando " + r);
         return EXITO;
        } catch (Exception e) {
         e.printStackTrace();
            System.out.println("Excepcion" + e.getMessage());
            return ERROR_DESCONOCIDO;

  }
 }}

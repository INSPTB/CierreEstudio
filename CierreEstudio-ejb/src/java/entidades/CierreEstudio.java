/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.NamedQuery;

/**
 *
 * @author User
 */
@Entity
/*@NamedQuery(name = "CierreEstudio.findById", query = "SELECT d from cierreEstudio d where d.folio=:folio")*/
public class CierreEstudio implements Serializable {

 @Id
 private String p02folio;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p01fechaLlenado;
 private Integer p03edadMeses;
 private String p04aPaterno;
 private String p04aMaterno;
 private String p04nombre;
 private String p05aPaternoT;
 private String p05aMaternoT;
 private String p05nombreT;
 private String p06calle;
 private Integer p06nExterior;
 private Integer p06nInterior;
 private Integer p07codigo;
 private String p08colonia;
 private String p09localidad;
 private String p10municipio;
 private Integer p11leHanPuesto;
 private Integer p12seVacuno;
 private String p12porqueSeVacuno;
 private Integer p13noSeVacuno;
 private String p13porqueNoSeVacuno;
 private Integer p14vacunaOPV;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p14fechaUno;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p14fechaDos;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15unicaBCG;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15primeraHepatitis;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15segundaHepatitis;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15terceraHepatitis;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15primeraPenta;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15segundaPenta;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15terceraPenta;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15cuartaPenta;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15refuerzoDPT;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15primeraSRP;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15refuerzoSRP;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15primeraRotavirus;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15segundaRotavirus;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15terceraRotavirus;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15primeraNeumococica;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15segundaNeumococica; 
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15refuerzoNeumococica; 
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15primeraInfluenza;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15segundaInfluenza;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15revacunacionInfluenza;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date p15adicionalesSR;
 private Integer p16otroUsted;
 private Integer p17OtroFamilia;
 @Temporal(javax.persistence.TemporalType.TIMESTAMP)
 private Date z02fechaCaptura;

 public CierreEstudio() {
 }

 public String getP02folio() {
  return p02folio;
 }

 public void setP02folio(String p02folio) {
  this.p02folio = p02folio;
 }

 public Date getP01fechaLlenado() {
  return p01fechaLlenado;
 }

 public void setP01fechaLlenado(Date p01fechaLlenado) {
  this.p01fechaLlenado = p01fechaLlenado;
 }

 public Integer getP03edadMeses() {
  return p03edadMeses;
 }

 public void setP03edadMeses(Integer p03edadMeses) {
  this.p03edadMeses = p03edadMeses;
 }

 public String getP04aPaterno() {
  return p04aPaterno;
 }

 public void setP04aPaterno(String p04aPaterno) {
  this.p04aPaterno = p04aPaterno;
 }

 public String getP04aMaterno() {
  return p04aMaterno;
 }

 public void setP04aMaterno(String p04aMaterno) {
  this.p04aMaterno = p04aMaterno;
 }

 public String getP04nombre() {
  return p04nombre;
 }

 public void setP04nombre(String p04nombre) {
  this.p04nombre = p04nombre;
 }

 public String getP05aPaternoT() {
  return p05aPaternoT;
 }

 public void setP05aPaternoT(String p05aPaternoT) {
  this.p05aPaternoT = p05aPaternoT;
 }

 public String getP05aMaternoT() {
  return p05aMaternoT;
 }

 public void setP05aMaternoT(String p05aMaternoT) {
  this.p05aMaternoT = p05aMaternoT;
 }

 public String getP05nombreT() {
  return p05nombreT;
 }

 public void setP05nombreT(String p05nombreT) {
  this.p05nombreT = p05nombreT;
 }

 public String getP06calle() {
  return p06calle;
 }

 public void setP06calle(String p06calle) {
  this.p06calle = p06calle;
 }

 public Integer getP06nExterior() {
  return p06nExterior;
 }

 public void setP06nExterior(Integer p06nExterior) {
  this.p06nExterior = p06nExterior;
 }

 public Integer getP06nInterior() {
  return p06nInterior;
 }

 public void setP06nInterior(Integer p06nInterior) {
  this.p06nInterior = p06nInterior;
 }

 public Integer getP07codigo() {
  return p07codigo;
 }

 public void setP07codigo(Integer p07codigo) {
  this.p07codigo = p07codigo;
 }

 public String getP08colonia() {
  return p08colonia;
 }

 public void setP08colonia(String p08colonia) {
  this.p08colonia = p08colonia;
 }

 public String getP09localidad() {
  return p09localidad;
 }

 public void setP09localidad(String p09localidad) {
  this.p09localidad = p09localidad;
 }

 public String getP10municipio() {
  return p10municipio;
 }

 public void setP10municipio(String p10municipio) {
  this.p10municipio = p10municipio;
 }

 public Integer getP11leHanPuesto() {
  return p11leHanPuesto;
 }

 public void setP11leHanPuesto(Integer p11leHanPuesto) {
  this.p11leHanPuesto = p11leHanPuesto;
 }

 public Integer getP12seVacuno() {
  return p12seVacuno;
 }

 public void setP12seVacuno(Integer p12seVacuno) {
  this.p12seVacuno = p12seVacuno;
 }

 public String getP12porqueSeVacuno() {
  return p12porqueSeVacuno;
 }

 public void setP12porqueSeVacuno(String p12porqueSeVacuno) {
  this.p12porqueSeVacuno = p12porqueSeVacuno;
 }

 public Integer getP13noSeVacuno() {
  return p13noSeVacuno;
 }

 public void setP13noSeVacuno(Integer p13noSeVacuno) {
  this.p13noSeVacuno = p13noSeVacuno;
 }

 public String getP13porqueNoSeVacuno() {
  return p13porqueNoSeVacuno;
 }

 public void setP13porqueNoSeVacuno(String p13porqueNoSeVacuno) {
  this.p13porqueNoSeVacuno = p13porqueNoSeVacuno;
 }

 public Integer getP14vacunaOPV() {
  return p14vacunaOPV;
 }

 public void setP14vacunaOPV(Integer p14vacunaOPV) {
  this.p14vacunaOPV = p14vacunaOPV;
 }

 public Date getP14fechaUno() {
  return p14fechaUno;
 }

 public void setP14fechaUno(Date p14fechaUno) {
  this.p14fechaUno = p14fechaUno;
 }

 public Date getP14fechaDos() {
  return p14fechaDos;
 }

 public void setP14fechaDos(Date p14fechaDos) {
  this.p14fechaDos = p14fechaDos;
 }

 public Date getP15unicaBCG() {
  return p15unicaBCG;
 }

 public void setP15unicaBCG(Date p15unicaBCG) {
  this.p15unicaBCG = p15unicaBCG;
 }

 public Date getP15primeraHepatitis() {
  return p15primeraHepatitis;
 }

 public void setP15primeraHepatitis(Date p15primeraHepatitis) {
  this.p15primeraHepatitis = p15primeraHepatitis;
 }

 public Date getP15segundaHepatitis() {
  return p15segundaHepatitis;
 }

 public void setP15segundaHepatitis(Date p15segundaHepatitis) {
  this.p15segundaHepatitis = p15segundaHepatitis;
 }

 public Date getP15terceraHepatitis() {
  return p15terceraHepatitis;
 }

 public void setP15terceraHepatitis(Date p15terceraHepatitis) {
  this.p15terceraHepatitis = p15terceraHepatitis;
 }

 public Date getP15primeraPenta() {
  return p15primeraPenta;
 }

 public void setP15primeraPenta(Date p15primeraPenta) {
  this.p15primeraPenta = p15primeraPenta;
 }

 public Date getP15segundaPenta() {
  return p15segundaPenta;
 }

 public void setP15segundaPenta(Date p15segundaPenta) {
  this.p15segundaPenta = p15segundaPenta;
 }

 public Date getP15terceraPenta() {
  return p15terceraPenta;
 }

 public void setP15terceraPenta(Date p15terceraPenta) {
  this.p15terceraPenta = p15terceraPenta;
 }

 public Date getP15cuartaPenta() {
  return p15cuartaPenta;
 }

 public void setP15cuartaPenta(Date p15cuartaPenta) {
  this.p15cuartaPenta = p15cuartaPenta;
 }

 public Date getP15refuerzoDPT() {
  return p15refuerzoDPT;
 }

 public void setP15refuerzoDPT(Date p15refuerzoDPT) {
  this.p15refuerzoDPT = p15refuerzoDPT;
 }

 public Date getP15primeraSRP() {
  return p15primeraSRP;
 }

 public void setP15primeraSRP(Date p15primeraSRP) {
  this.p15primeraSRP = p15primeraSRP;
 }

 public Date getP15refuerzoSRP() {
  return p15refuerzoSRP;
 }

 public void setP15refuerzoSRP(Date p15refuerzoSRP) {
  this.p15refuerzoSRP = p15refuerzoSRP;
 }

 public Date getP15primeraRotavirus() {
  return p15primeraRotavirus;
 }

 public void setP15primeraRotavirus(Date p15primeraRotavirus) {
  this.p15primeraRotavirus = p15primeraRotavirus;
 }

 public Date getP15segundaRotavirus() {
  return p15segundaRotavirus;
 }

 public void setP15segundaRotavirus(Date p15segundaRotavirus) {
  this.p15segundaRotavirus = p15segundaRotavirus;
 }

 public Date getP15terceraRotavirus() {
  return p15terceraRotavirus;
 }

 public void setP15terceraRotavirus(Date p15terceraRotavirus) {
  this.p15terceraRotavirus = p15terceraRotavirus;
 }

 public Date getP15primeraNeumococica() {
  return p15primeraNeumococica;
 }

 public void setP15primeraNeumococica(Date p15primeraNeumococica) {
  this.p15primeraNeumococica = p15primeraNeumococica;
 }

 public Date getP15segundaNeumococica() {
  return p15segundaNeumococica;
 }

 public void setP15segundaNeumococica(Date p15segundaNeumococica) {
  this.p15segundaNeumococica = p15segundaNeumococica;
 }

 public Date getP15refuerzoNeumococica() {
  return p15refuerzoNeumococica;
 }

 public void setP15refuerzoNeumococica(Date p15refuerzoNeumococica) {
  this.p15refuerzoNeumococica = p15refuerzoNeumococica;
 }

 public Date getP15primeraInfluenza() {
  return p15primeraInfluenza;
 }

 public void setP15primeraInfluenza(Date p15primeraInfluenza) {
  this.p15primeraInfluenza = p15primeraInfluenza;
 }

 public Date getP15segundaInfluenza() {
  return p15segundaInfluenza;
 }

 public void setP15segundaInfluenza(Date p15segundaInfluenza) {
  this.p15segundaInfluenza = p15segundaInfluenza;
 }

 public Date getP15revacunacionInfluenza() {
  return p15revacunacionInfluenza;
 }

 public void setP15revacunacionInfluenza(Date p15revacunacionInfluenza) {
  this.p15revacunacionInfluenza = p15revacunacionInfluenza;
 }

 public Date getP15adicionalesSR() {
  return p15adicionalesSR;
 }

 public void setP15adicionalesSR(Date p15adicionalesSR) {
  this.p15adicionalesSR = p15adicionalesSR;
 }

 public Integer getP16otroUsted() {
  return p16otroUsted;
 }

 public void setP16otroUsted(Integer p16otroUsted) {
  this.p16otroUsted = p16otroUsted;
 }

 public Integer getP17OtroFamilia() {
  return p17OtroFamilia;
 }

 public void setP17OtroFamilia(Integer p17OtroFamilia) {
  this.p17OtroFamilia = p17OtroFamilia;
 }
 
 public Date getZ02fechaCaptura() {
  return z02fechaCaptura;
 }

 public void setZ02fechaCaptura(Date z02fechaCaptura) {
  this.z02fechaCaptura = z02fechaCaptura;
 }

 @Override
 public int hashCode() {
  int hash = 3;
  hash = 97 * hash + Objects.hashCode(this.p02folio);
  return hash;
 }

 @Override
 public boolean equals(Object obj) {
  if (obj == null) {
   return false;
  }
  if (getClass() != obj.getClass()) {
   return false;
  }
  final CierreEstudio other = (CierreEstudio) obj;
  if (!Objects.equals(this.p02folio, other.p02folio)) {
   return false;
  }
  return true;
 }
 
  @Override
    public String toString() {
        return "entidades.CierreEstudio[ id=" + p02folio + " ]";
    }
 
 

}

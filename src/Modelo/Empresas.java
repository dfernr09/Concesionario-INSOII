package Modelo;
// Generated 15-abr-2019 17:37:06 by Hibernate Tools 4.3.1



/**
 * Empresas generated by hbm2java
 */
public class Empresas  implements java.io.Serializable {


     private Integer idEmpresa;
     private String nombre;
     private String cif;

    public Empresas() {
    }

    public Empresas(String nombre, String cif) {
       this.nombre = nombre;
       this.cif = cif;
    }
   
    public Integer getIdEmpresa() {
        return this.idEmpresa;
    }
    
    public void setIdEmpresa(Integer idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCif() {
        return this.cif;
    }
    
    public void setCif(String cif) {
        this.cif = cif;
    }




}



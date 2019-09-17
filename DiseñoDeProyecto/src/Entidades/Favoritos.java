/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 * alexis porfavor hace esto
 *
 * @author josue
 */
public class Favoritos {

    int idfavoritos, estado, idtrabajador_fk, idempresa_fk;

    public int getIdfavoritos() {
        return idfavoritos;
    }

    public void setIdfavoritos(int idfavoritos) {
        this.idfavoritos = idfavoritos;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdtrabajador_fk() {
        return idtrabajador_fk;
    }

    public void setIdtrabajador_fk(int idtrabajador_fk) {
        this.idtrabajador_fk = idtrabajador_fk;
    }

    public int getIdempresa_fk() {
        return idempresa_fk;
    }

    public void setIdempresa_fk(int idempresa_fk) {
        this.idempresa_fk = idempresa_fk;
    }

    public String getNotificacion() {
        return notificacion;
    }

    public void setNotificacion(String notificacion) {
        this.notificacion = notificacion;
    }
    String notificacion;

}

package com.soaint.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="ac_menu")
public class AcMenu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_menu;

    @Column(name="descripcion")
    private String descripcion;

    @Column(name="url")
    private String url;

    @Column(name="id_rol")
    private Long id_rol;

    @Column(name="icon")
    private String icon;

    @Column(name="id_padre")
    private Long id_padre;

    @Column(name="id_abuelo")
    private Long id_abuelo;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public Long getId_menu() {
        return id_menu;
    }

    public void setId_menu(Long id_menu) {
        this.id_menu = id_menu;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId_rol() {
        return id_rol;
    }

    public void setId_rol(Long id_rol) {
        this.id_rol = id_rol;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Long getId_padre() {
        return id_padre;
    }

    public void setId_padre(Long id_padre) {
        this.id_padre = id_padre;
    }

    public Long getId_abuelo() {
        return id_abuelo;
    }

    public void setId_abuelo(Long id_abuelo) {
        this.id_abuelo = id_abuelo;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcMenu acMenu = (AcMenu) o;
        return Objects.equals(id_menu, acMenu.id_menu) &&
                Objects.equals(descripcion, acMenu.descripcion) &&
                Objects.equals(url, acMenu.url) &&
                Objects.equals(id_rol, acMenu.id_rol) &&
                Objects.equals(icon, acMenu.icon) &&
                Objects.equals(id_padre, acMenu.id_padre) &&
                Objects.equals(id_abuelo, acMenu.id_abuelo) &&
                Objects.equals(created_at, acMenu.created_at) &&
                Objects.equals(updated_at, acMenu.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_menu, descripcion, url, id_rol, icon, id_padre, id_abuelo, created_at, updated_at);
    }
}

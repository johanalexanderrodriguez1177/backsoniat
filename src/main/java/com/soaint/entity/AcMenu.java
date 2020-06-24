package com.soaint.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="ac_menu")
@ApiModel("Modelo => MENU")
public class AcMenu {

    @Id
    @NotNull
    @ApiModelProperty(value = "Campo Id Autoincrementable del Menu", required = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ApiModelProperty(value = "Campo Id Descripcion", required = true)
    @Column(name="description")
    private String description;

    @NotNull
    @ApiModelProperty(value = "Campo url", required = true)
    @Column(name="url")
    private String url;

    @NotNull
    @ApiModelProperty(value = "Campo Id Rol", required = true)
    @Column(name="id_rol")
    private Long id_rol;

    @ApiModelProperty(value = "Campo Icono")
    @Column(name="icon")
    private String icon;

    @ApiModelProperty(value = "Campo Nivel")
    @Column(name="level")
    private Long level;

    @ApiModelProperty(value = "Campo Fecha y Hora de Creacion")
    @Column(name="created_at")
    private Date created_at;

    @Column(name="updated_at")
    @ApiModelProperty(value = "Campo Fecha y Hora de Actualizacion")
    private Date updated_at;

    public AcMenu() {
    }

    public AcMenu(@NotNull Long id, @NotNull String description, @NotNull String url, @NotNull Long id_rol, @NotNull String icon, @NotNull Long level, Date created_at, Date updated_at) {
        this.id = id;
        this.description = description;
        this.url = url;
        this.id_rol = id_rol;
        this.icon = icon;
        this.level = level;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Long getLevel() {
        return level;
    }

    public void setLevel(Long level) {
        this.level = level;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcMenu acMenu = (AcMenu) o;
        return id.equals(acMenu.id) &&
                description.equals(acMenu.description) &&
                url.equals(acMenu.url) &&
                id_rol.equals(acMenu.id_rol) &&
                icon.equals(acMenu.icon) &&
                level.equals(acMenu.level) &&
                created_at.equals(acMenu.created_at) &&
                updated_at.equals(acMenu.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, url, id_rol, icon, level, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "AcMenu{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", id_rol='" + id_rol + '\'' +
                ", icon='" + icon + '\'' +
                ", level='" + level + '\'' +
                ", created_at='" + created_at + '\'' +
                ", updated_at='" + updated_at + '\'' +
                '}';
    }

}

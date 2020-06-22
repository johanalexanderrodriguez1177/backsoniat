package com.soaint.entity;

import io.swagger.annotations.Api;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="ac_data_users")
@Api(tags = "USERS")
public class AcDataUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_data_users;

    @Column(name="cedula")
    private Long cedula;

    @Column(name="nombres")
    private String nombres;

    @Column(name="apellidos")
    private String apellidos;

    @Column(name="fecha_nacimiento")
    private Date fecha_nacimiento;

    @Column(name="id_genero")
    private Long id_genero;

    @Column(name="telefono_movil")
    private String telefono_movil;

    @Column(name="telefono_local")
    private String telefono_local;

    @Column(name="imagen_user")
    private String imagen_user;

    @Column(name="id_user")
    private Long id_user;

    @Column(name="id_pais")
    private Long id_pais;

    @Column(name="id_nacionalidad")
    private Long id_nacionalidad;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public Long getId() {
        return id_data_users;
    }

    public void setId(Long id_data_users) {
        this.id_data_users = id_data_users;
    }

    public Long getCedula() {
        return cedula;
    }

    public void setCedula(Long cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return nombres;
    }

    public void setName(String nombres) {
        this.nombres = nombres;
    }

    public String getLastName() {
        return apellidos;
    }

    public void setLastName(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fecha_nacimiento;
    }

    public void setFechaNacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Long getGenero() {
        return id_genero;
    }

    public void setGenero(Long id_genero) {
        this.id_genero = id_genero;
    }

    public String getTelefonoMovil() {
        return telefono_movil;
    }

    public void setTelefonoMovil(String telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public String getTelefonolocal() {
        return telefono_local;
    }

    public void setTelefonolocal(String telefono_local) {
        this.telefono_local = telefono_local;
    }

    public String getImagenUser() {
        return imagen_user;
    }

    public void setImagenUser(String imagen_user) {
        this.imagen_user = imagen_user;
    }

    public Long getIdUser() {
        return id_user;
    }

    public void setIdUser(Long id_user) {
        this.id_user = id_user;
    }

    public Long getIdPais() {
        return id_pais;
    }

    public void setIdPais(Long id_pais) {
        this.id_pais = id_pais;
    }

    public Long getIdNacionalidad() {
        return id_nacionalidad;
    }

    public void setIdNacionalidad(Long id_nacionalidad) {
        this.id_nacionalidad = id_nacionalidad;
    }

    public Timestamp getCreatedAt() {
        return created_at;
    }

    public void setCreatedAt(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdatedAt() {
        return updated_at;
    }

    public void setUpdatedAt(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcDataUsers ac_data_users = (AcDataUsers) o;
        return Objects.equals(id_data_users, ac_data_users.id_data_users) &&
                Objects.equals(cedula, ac_data_users.cedula) &&
                Objects.equals(nombres, ac_data_users.nombres) &&
                Objects.equals(apellidos, ac_data_users.apellidos) &&
                Objects.equals(fecha_nacimiento, ac_data_users.fecha_nacimiento) &&
                Objects.equals(id_genero, ac_data_users.id_genero) &&
                Objects.equals(telefono_movil, ac_data_users.telefono_movil) &&
                Objects.equals(telefono_local, ac_data_users.telefono_local) &&
                Objects.equals(imagen_user, ac_data_users.imagen_user) &&
                Objects.equals(id_user, ac_data_users.id_user) &&
                Objects.equals(id_pais, ac_data_users.id_pais) &&
                Objects.equals(id_nacionalidad, ac_data_users.id_nacionalidad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_data_users, cedula, nombres, apellidos, fecha_nacimiento,
                id_genero, telefono_movil, telefono_local, imagen_user, id_user, id_pais, id_nacionalidad);
    }

}

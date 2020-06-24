package com.soaint.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name="ac_data_users")
@ApiModel("Modelo => USERS")
public class AcDataUsers {

    @Id
    @NotNull
    @ApiModelProperty(value = "Campo Id Autoincrementable de Usuarios", required = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @ApiModelProperty(value = "Campo Documento de Identificacion", required = true)
    @Column(name="identification_card")
    private Long identification_card;

    @NotNull
    @ApiModelProperty(value = "Campo Nombres", required = true)
    @Column(name="names")
    private String names;

    @NotNull
    @ApiModelProperty(value = "Campo Apellidos", required = true)
    @Column(name="last_names")
    private String last_names;

    @NotNull
    @ApiModelProperty(value = "Campo Fecha de Nacimiento", required = true)
    @Column(name="birth_date")
    private Date birth_date;

    @NotNull
    @ApiModelProperty(value = "Campo Genero", required = true)
    @Column(name="id_gender")
    private Long id_gender;

    @ApiModelProperty(value = "Campo Telefono Celular")
    @Column(name="mobile_phone")
    private String mobile_phone;

    @ApiModelProperty(value = "Campo Telefono Local")
    @Column(name="local_telephone")
    private String local_telephone;

    @ApiModelProperty(value = "Campo Imagen Usuario")
    @Column(name="image_user")
    private String image_user;

    @NotNull
    @ApiModelProperty(value = "Campo Id Usuario", required = true)
    @Column(name="id_user")
    private Long id_user;

    @NotNull
    @ApiModelProperty(value = "Campo Id Pais", required = true)
    @Column(name="id_country")
    private Long id_country;

    @NotNull
    @ApiModelProperty(value = "Campo Id Nacionalidad", required = true)
    @Column(name="id_nationality")
    private Long id_nationality;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdentification_card() {
        return identification_card;
    }

    public void setIdentification_card(Long identification_card) {
        this.identification_card = identification_card;
    }

    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getLast_names() {
        return last_names;
    }

    public void setLast_names(String last_names) {
        this.last_names = last_names;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Long getId_gender() {
        return id_gender;
    }

    public void setId_gender(Long id_gender) {
        this.id_gender = id_gender;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getLocal_telephone() {
        return local_telephone;
    }

    public void setLocal_telephone(String local_telephone) {
        this.local_telephone = local_telephone;
    }

    public String getImage_user() {
        return image_user;
    }

    public void setImage_user(String image_user) {
        this.image_user = image_user;
    }

    public Long getId_user() {
        return id_user;
    }

    public void setId_user(Long id_user) {
        this.id_user = id_user;
    }

    public Long getId_country() {
        return id_country;
    }

    public void setId_country(Long id_country) {
        this.id_country = id_country;
    }

    public Long getId_nationality() {
        return id_nationality;
    }

    public void setId_nationality(Long id_nationality) {
        this.id_nationality = id_nationality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AcDataUsers that = (AcDataUsers) o;
        return id.equals(that.id) &&
                identification_card.equals(that.identification_card) &&
                names.equals(that.names) &&
                last_names.equals(that.last_names) &&
                birth_date.equals(that.birth_date) &&
                id_gender.equals(that.id_gender) &&
                mobile_phone.equals(that.mobile_phone) &&
                local_telephone.equals(that.local_telephone) &&
                image_user.equals(that.image_user) &&
                id_user.equals(that.id_user) &&
                id_country.equals(that.id_country) &&
                id_nationality.equals(that.id_nationality);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, identification_card, names, last_names, birth_date, id_gender, mobile_phone, local_telephone, image_user, id_user, id_country, id_nationality);
    }

    @Override
    public String toString() {
        return "AcDataUsers{" +
                ", identification_card='" + identification_card + '\'' +
                ", names='" + names + '\'' +
                ", last_names='" + last_names + '\'' +
                ", birth_date='" + birth_date + '\'' +
                ", id_gender='" + id_gender + '\'' +
                ", mobile_phone='" + mobile_phone + '\'' +
                ", local_telephone='" + local_telephone + '\'' +
                ", image_user='" + image_user + '\'' +
                ", id_user='" + id_user + '\'' +
                ", id_country='" + id_country + '\'' +
                ", id_nationality='" + id_nationality + '\'' +
                '}';
    }

}

package com.soaint.controller;

import com.soaint.DTO.Mensaje;
import com.soaint.entity.AcDataUsers;
import com.soaint.entity.AcDataUsersRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.soaint.service.DataUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = "USERS")
public class DataUsersController {

    @Autowired
    DataUsersService dataUsersService;

    @GetMapping("/find-data-users")
    @ApiOperation(value = "Devuelve toda la data de los usuarios", notes = "Devuelve toda la data de los usuarios del sistema")
    public List<AcDataUsers> findAll(){
        return dataUsersService.obtenerDataUsers();
    }

    @GetMapping("/find-data-users/{id}")
    @ApiOperation(value = "Busca la data de un usuario por ID", notes = "Devuelve los datos relativos de un usuario")
    public ResponseEntity<AcDataUsers> getOne(@PathVariable Long id){
        if(!dataUsersService.dataId(id))
            return new ResponseEntity(new Mensaje("No existe ese usuario"), HttpStatus.NOT_FOUND);
        AcDataUsers acDataUsers = dataUsersService.dataPorId(id).get();
        return new ResponseEntity<AcDataUsers>(acDataUsers, HttpStatus.OK);
    }

    @PostMapping("/create-data-user")
    @ApiOperation(value = "Crear Data del usuario", notes = "Crear data de un nuevo usuario")
    public ResponseEntity<?> create(@RequestBody AcDataUsers acDataUsers){
        dataUsersService.crearData(acDataUsers);
        return new ResponseEntity(new Mensaje("Data del Usuario registrado."), HttpStatus.CREATED);
    }

    @PutMapping("/update-data-user/{id}")
    @ApiOperation(value = "Actualiza los datos de un usuario", notes = "Actualiza los datos del usuario que se corresponda con el id. El usuario debe existir")
    public ResponseEntity<?> update(@RequestBody AcDataUsers acDataUsers, @PathVariable("id") Long id){
        if(!dataUsersService.dataId(id))
            return new ResponseEntity(new Mensaje("No existe el usuario"), HttpStatus.NOT_FOUND);
        AcDataUsers dataUserUpdate = dataUsersService.dataPorId(id).get();
        dataUserUpdate.setIdentification_card(acDataUsers.getIdentification_card());
        dataUserUpdate.setNames(acDataUsers.getNames());
        dataUserUpdate.setLast_names(acDataUsers.getLast_names());
        dataUserUpdate.setBirth_date(acDataUsers.getBirth_date());
        dataUserUpdate.setId_gender(acDataUsers.getId_gender());
        dataUserUpdate.setMobile_phone(acDataUsers.getMobile_phone());
        dataUserUpdate.setLocal_telephone(acDataUsers.getLocal_telephone());
        dataUserUpdate.setImage_user(acDataUsers.getImage_user());
        dataUserUpdate.setId_user(acDataUsers.getId_user());
        dataUserUpdate.setId_country(acDataUsers.getId_country());
        dataUserUpdate.setId_nationality(acDataUsers.getId_nationality());
        dataUserUpdate.setCreated_at(acDataUsers.getCreated_at());
        dataUserUpdate.setUpdated_at(acDataUsers.getUpdated_at());
        dataUsersService.guardarData(dataUserUpdate);
        return new ResponseEntity(new Mensaje("Usuario actualizado"), HttpStatus.CREATED);
    }


    @DeleteMapping("/delete-data-user/{id}")
    @ApiOperation(value = "Elimina la data de un usuario", notes = "Elimina la data del usuario que corresponda con el id. El usuario debe existir")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(!dataUsersService.dataId(id))
            return new ResponseEntity(new Mensaje("No existe data del usuario"), HttpStatus.NOT_FOUND);
        dataUsersService.borrarData(id);
        return new ResponseEntity(new Mensaje("Data del Usuario eliminada"), HttpStatus.OK);
    }

}

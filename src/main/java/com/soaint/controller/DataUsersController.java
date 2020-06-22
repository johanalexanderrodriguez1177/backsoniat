package com.soaint.controller;

import com.soaint.entity.AcDataUsers;
import com.soaint.entity.AcDataUsersRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = "USERS")
public class DataUsersController {

    @Autowired
    private AcDataUsersRepository acDataUsersRepository;

    @GetMapping("/find-all")
    @ApiOperation(value = "DATA USUARIOS", notes = "INFORMACION USUARIOS")
    public List<AcDataUsers> findAll(){
        return acDataUsersRepository.findAll();
    }

//    @GetMapping("/find/{id_user}")
//    @ApiOperation(value = "Busca la data de un usuario por ID", notes = "Devuelve los datos relativos de un usuario")
//    public Optional<AcDataUsers> findById(@PathParam("id_user") Long id_user){
//        return acDataUsersRepository.findById((long) 1);
//    }

}

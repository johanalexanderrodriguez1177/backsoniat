package com.soaint.controller;

import com.soaint.DTO.Mensaje;
import com.soaint.entity.AcDataUsers;
import com.soaint.entity.AcMenu;
import com.soaint.entity.AcMenuRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import com.soaint.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@Api(tags = "MENU")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @GetMapping("/menu")
    @ApiOperation(value = "DATA MENU", notes = "INFORMACION DEL MENU")
    public List<AcMenu> findAll(){
        return menuService.obtenerDataMenu();
    }

    @PostMapping("/create-menu")
    @ApiOperation(value = "Crear opcion del menu", notes = "Crear opcion para el menu")
    public ResponseEntity<?> create(@RequestBody AcMenu acMenu){
        menuService.guardarMenu(acMenu);
        return new ResponseEntity(new Mensaje("Data del Usuario registrado."), HttpStatus.CREATED);
    }

    @PutMapping("/update-menu/{id}")
    @ApiOperation(value = "Actualizar Menu", notes = "Actualizar Menu")
    public ResponseEntity<?> update(@RequestBody AcMenu acMenu, @PathVariable("id") Long id){
        if(!menuService.dataMenu(id))
            return new ResponseEntity(new Mensaje("No existe esa opcion del menu"), HttpStatus.NOT_FOUND);
        AcMenu menuUpdate = menuService.menuPorId(id).get();
        menuUpdate.setDescription(acMenu.getDescription());
        menuUpdate.setUrl(acMenu.getUrl());
        menuUpdate.setId_rol(acMenu.getId_rol());
        menuUpdate.setIcon(acMenu.getIcon());
        menuUpdate.setLevel(acMenu.getLevel());
        menuService.guardarMenu(menuUpdate);
        return new ResponseEntity(new Mensaje("Usuario actualizado"), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete-menu/{id}")
    @ApiOperation(value = "Elimina una opcion del menu", notes = "Elimina una opcion del menu que corresponda con el id. La opcion debe existir")
    public ResponseEntity<?> delete(@PathVariable Long id){
        if(!menuService.dataMenu(id))
            return new ResponseEntity(new Mensaje("No existe data del usuario"), HttpStatus.NOT_FOUND);
        menuService.borrarMenu(id);
        return new ResponseEntity(new Mensaje("Data del Usuario eliminada"), HttpStatus.OK);
    }

}

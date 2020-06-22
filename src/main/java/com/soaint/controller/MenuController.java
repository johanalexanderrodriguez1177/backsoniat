package com.soaint.controller;

import com.soaint.entity.AcMenu;
import com.soaint.entity.AcMenuRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Api(tags = "MENU")
public class MenuController {

    @Autowired
    private AcMenuRepository acMenuRepository;

    @GetMapping("/menu")
    @ApiOperation(value = "DATA MENU", notes = "INFORMACION DEL MENU")
    public List<AcMenu> findAll(){
        return acMenuRepository.findAll();
    }

}

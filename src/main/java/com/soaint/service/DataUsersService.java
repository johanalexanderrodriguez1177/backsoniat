package com.soaint.service;

import com.soaint.entity.AcDataUsers;
import com.soaint.entity.AcDataUsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//Realizará operaciones contra una base de datos, @Service, @Transactional
@Service
@Transactional
public class DataUsersService {

    //@Autowired para instanciar una interfaz tipo UserRepository en el caso de que se necesite.
    @Autowired
    AcDataUsersRepository acDataUsersRepository;

    public List<AcDataUsers> obtenerDataUsers(){
        List<AcDataUsers> data = acDataUsersRepository.findAll();
        return data;
    }

    public Optional<AcDataUsers> dataPorId(Long id){
        return acDataUsersRepository.findById(id);
    }

    public boolean dataId(Long id) {
        return acDataUsersRepository.existsById(id);
    }

    public void guardarData(AcDataUsers acDataUsers){
        acDataUsersRepository.save(acDataUsers);
    }

    public void crearData(AcDataUsers acDataUsers){
        acDataUsersRepository.save(acDataUsers);
    }

    public void borrarData(Long id){
        acDataUsersRepository.deleteById(id);
    }

}

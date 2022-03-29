package com.transacciones.ejercicio6.controller;

import com.transacciones.ejercicio6.entity.Person;
import com.transacciones.ejercicio6.repository.personRepository;
import com.transacciones.ejercicio6.service.personService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class personController {
    @Autowired
    private personService personService;

    @GetMapping(value="/persons")
    public List<Person> persons(){return (List<Person>) personService.persons();}

    @PostMapping(value = "/persons")
    public void createPersonDeclarativeWithRuntimeException(@RequestBody Person person){
        personService.createPersonDeclarativeWithRuntimeException(person);
    }
}

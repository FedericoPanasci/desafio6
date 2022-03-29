package com.transacciones.ejercicio6.service;

import com.transacciones.ejercicio6.entity.Person;
import com.transacciones.ejercicio6.repository.personRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class personService {
    @Autowired
    private personRepository personRepository;

    public Person createPerson(Person person){
        return personRepository.save(person);
    }

    public List<Person> persons(){
        return (List<Person>) personRepository.findAll();
    }

    @Transactional
    public void createPersonDeclarativeWithRuntimeException(Person person){
        if (person.getAlias() == null){
            throw new DataIntegrityViolationException("No se puede guardar por excepcion");
        } else {
            personRepository.save(person);
        }
    }
}

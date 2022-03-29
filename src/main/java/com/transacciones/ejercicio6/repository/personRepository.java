package com.transacciones.ejercicio6.repository;

import com.transacciones.ejercicio6.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface personRepository extends JpaRepository<Person, Long> {
}

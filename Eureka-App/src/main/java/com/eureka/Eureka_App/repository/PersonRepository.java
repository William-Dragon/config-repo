package com.eureka.Eureka_App.repository;

import com.eureka.Eureka_App.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {}

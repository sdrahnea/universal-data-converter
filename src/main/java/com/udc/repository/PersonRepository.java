package com.udc.repository;

import com.udc.model.Person;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sdrahnea
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

}
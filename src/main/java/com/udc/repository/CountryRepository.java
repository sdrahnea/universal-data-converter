package com.udc.repository;

import com.udc.model.Country;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sdrahnea
 */
public interface CountryRepository extends CrudRepository<Country, Long> {

}
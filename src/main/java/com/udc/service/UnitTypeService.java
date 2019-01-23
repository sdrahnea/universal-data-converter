package com.udc.service;

import com.udc.model.UnitType;
import org.springframework.stereotype.Component;

/**
 * Created by sdrahnea
 */
@Component
public class UnitTypeService extends AbstractService<UnitType> {

  private static final String PROVIDER = "PROVIDER";
  private static final String CLIENT = "CLIENT";
  private static final String PERSON = "PERSON";

  public UnitType getProviderEntity(){
    return findByName(PROVIDER);
  }

  public UnitType getClientEntity(){
    return findByName(CLIENT);
  }

  public UnitType getPersonEntity(){
    return findByName(PERSON);
  }



}

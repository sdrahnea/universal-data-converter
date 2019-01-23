package com.udc.controller;

import com.udc.model.Person;
import com.udc.model.Unit;
import com.udc.service.UnitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/unit")
public class UnitController extends AbstractController<Unit> {

  @Autowired
  private UnitService unitService;

  public List<Unit> getProviderList() {
    return unitService.getProviderList();
  }

  public List<Unit> getClientList() {
    return unitService.getClientList();
  }

  public void addPerson() {
    this.getSelectedObject().getPersons().add(new Person());
  }

}
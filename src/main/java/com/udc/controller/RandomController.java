package com.udc.controller;

import com.udc.controller.data.FirstNameController;
import com.udc.controller.data.LastNameController;
import com.udc.model.Country;
import com.udc.model.Person;
import com.udc.model.Unit;
import com.udc.model.UnitIndustry;
import com.udc.util.RandomUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sdrahnea
 */
@RestController
@RequestMapping(value = "/random")
@CrossOrigin("*")
public class RandomController {

  @Autowired
  private UnitController unitController;

  @Autowired
  private FirstNameController firstNameController;

  @Autowired
  private LastNameController lastNameController;

  @Autowired
  private UnitIndustryController unitIndustryController;

  @Autowired
  private UnitTypeController unitTypeController;

  @Autowired
  private CountryController countryController;

  @RequestMapping(path = "/unit", method = RequestMethod.GET)
  public List<Unit> createRandomUnit() {
    List<Unit> result = new LinkedList<>();

    for(int i = 0; i < 100; i++){
      Unit unit = new Unit();

      unit.setAdditionalInfo(RandomUtility.generateSentence());
      unit.setAddress(RandomUtility.generateSentence());
      unit.setEmail(RandomUtility.generateEmail());
      unit.setFax(RandomUtility.generatePhone());
      unit.setPhone(RandomUtility.generatePhone());
      unit.setWebsite(RandomUtility.generateWebsite());

      List<Person> persons = new LinkedList<>();
      int numOfPerson = RandomUtility.generateNumber(1, 5);
      for (int personIndex = 0; personIndex < numOfPerson; personIndex++) {
        Person person = new Person();
        person.setFirstName(firstNameController.getRandomObject().getName());
        person.setLastName(lastNameController.getRandomObject().getName());
        person.setEmail(RandomUtility.generateEmail());
        person.setFax(RandomUtility.generatePhone());
        person.setPhone(RandomUtility.generatePhone());
        persons.add(person);
      }

      Country country = countryController.getRandomObject();
      unit.setCountry(country);

      UnitIndustry unitIndustry = unitIndustryController.getRandomObject();
      unit.setName(firstNameController.getRandomObject().getName() + " " + unitIndustry.getName());
      unit.setUnitIndustry(unitIndustry);
      unit.setUnitType(unitTypeController.getRandomObject());
      unit.setPersons(persons);

      unit = unitController.save(unit);
      result.add(unit);
    }

    return result;
  }

}

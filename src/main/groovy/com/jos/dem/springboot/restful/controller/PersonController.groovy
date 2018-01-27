package com.jos.dem.springboot.restful.controller

import static org.springframework.web.bind.annotation.RequestMethod.GET

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.beans.factory.annotation.Autowired

import com.jos.dem.springboot.restful.service.PersonService
import com.jos.dem.springboot.restful.model.Person

@RestController
@RequestMapping('/persons/**')
class PersonController {

  @Autowired
  PersonService personService

  @RequestMapping(method=GET)
  @ResponseBody
  List<Person> getPersons(){
    personService.getPersons()
  }

}

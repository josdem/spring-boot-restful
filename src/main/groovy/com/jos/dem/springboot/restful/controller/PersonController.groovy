package com.jos.dem.springboot.restful.controller

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

import com.jos.dem.springboot.restful.model.Person

@RestController
@RequestMapping('/persons/**')
class PersonController {

  @RequestMapping(consumes='application/json')
  List<Person> getPersons(){
    Person person = new Person(nickname:'josdem', email:'joseluis.delacruz@gmail.com')
    List<Person> persons = []
    persons << person
    persons
  }

}

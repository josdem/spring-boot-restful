package com.jos.dem.springboot.restful.controller

import static org.springframework.web.bind.annotation.RequestMethod.GET

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

import com.jos.dem.springboot.restful.model.Person

@RestController
@RequestMapping('/persons/**')
class PersonController {

  @RequestMapping(method=GET)
  @ResponseBody
  List<Person> getPersons(){
    Person person = new Person(nickname:'josdem', email:'joseluis.delacruz@gmail.com')
    List<Person> persons = []
    persons << person
    persons
  }

}

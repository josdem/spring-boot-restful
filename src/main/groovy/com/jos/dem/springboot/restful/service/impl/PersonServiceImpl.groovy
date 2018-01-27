package com.jos.dem.springboot.restful.service.impl

import org.springframework.stereotype.Service

import com.jos.dem.springboot.restful.service.PersonService
import com.jos.dem.springboot.restful.model.Person

@Service
class PersonServiceImpl implements PersonService {

  List<Person> getPersons(){
    Person person = new Person(nickname:'josdem', email:'joseluis.delacruz@gmail.com')
    List<Person> persons = []
    persons << person
    persons
  }

}

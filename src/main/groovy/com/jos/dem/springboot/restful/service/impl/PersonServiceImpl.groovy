package com.jos.dem.springboot.restful.service.impl

import org.springframework.stereotype.Service

import com.jos.dem.springboot.restful.service.PersonService
import com.jos.dem.springboot.restful.model.Person

@Service
class PersonServiceImpl implements PersonService {

  List<Person> getPersons(){
    throw new RuntimeException('This is a runtime exception')
  }

}

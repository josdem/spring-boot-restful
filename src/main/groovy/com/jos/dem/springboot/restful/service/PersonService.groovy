package com.jos.dem.springboot.restful.service

import com.jos.dem.springboot.restful.model.Person

interface PersonService {
  List<Person> getPersons()
}

package com.jos.dem.springboot.restful.controller

import static org.springframework.web.bind.annotation.RequestMethod.GET

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.http.HttpStatus

import com.jos.dem.springboot.restful.service.PersonService
import com.jos.dem.springboot.restful.model.Person
import com.jos.dem.springboot.restful.exception.BusinessException

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

  @ResponseStatus(value=HttpStatus.UNAUTHORIZED)
  @ExceptionHandler(BusinessException.class)
  ResponseEntity<String> handleException(BusinessException be){
    return new ResponseEntity<String>(be.message, HttpStatus.UNAUTHORIZED)
  }

}

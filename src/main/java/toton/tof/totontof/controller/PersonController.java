package toton.tof.totontof.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import toton.tof.totontof.model.Person;
import toton.tof.totontof.service.PersonService;

@RestController
@RequiredArgsConstructor
public class PersonController {
    private final PersonService personService;

    @RequestMapping(path = "person", method = RequestMethod.GET)
    public Person getPerson() {
        return personService.getPerson();
    }
}

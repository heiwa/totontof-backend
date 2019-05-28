package toton.tof.totontof.service;

import org.springframework.stereotype.Service;
import toton.tof.totontof.model.Person;

@Service
public class PersonService {
    public Person getPerson() {
        return new Person().builder()
                .name("hoge")
                .age(16)
                .gender("man")
                .build();
    }
}

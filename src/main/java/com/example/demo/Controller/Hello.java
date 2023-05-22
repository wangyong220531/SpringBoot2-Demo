package com.example.demo.Controller;

import com.example.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Autowired
    Person person;

    @RequestMapping("/person")
    public Person person() {
        String userName = person.getUsername();
        System.out.println(userName);
        return person;
    }
}

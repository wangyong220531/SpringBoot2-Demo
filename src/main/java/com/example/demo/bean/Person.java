package com.example.demo.bean;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Data
@ToString
@ConfigurationProperties(prefix = "person")
@Component
public class Person {
    private String username;
    private Boolean boss;
    private Date birth;
    private Integer age;
    private bean.Pet pet;
    private String[] interests;
    private List<String> animals;
    private Map<String,Object> score;
    private Set<Double> salaries;
    private Map<String,List<bean.Pet>> allPets;
}

package com.alishevcrud.dao;

import com.alishevcrud.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT, "Tom"));
        people.add(new Person(++PEOPLE_COUNT, "Bob"));
        people.add(new Person(++PEOPLE_COUNT, "Rick"));
        people.add(new Person(++PEOPLE_COUNT, "John"));
        people.add(new Person(++PEOPLE_COUNT, "Katy"));
    }

    public List<Person> index(){
        return people;
    }
    public Person show(int id){
        return  people.stream().
                filter(person -> person.getId() == id).findAny().orElse(null);
    }
}

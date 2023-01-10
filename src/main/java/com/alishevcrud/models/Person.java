package com.alishevcrud.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private int id;
    @NotEmpty(message = "Name should not be empty. ")
    @Size(min = 2, max = 40, message = "Name should be between 2 and 30 characters")
    private String fullName;
    @Min(value = 0, message = "Age should be greater than 0.")
    private int yearOfBirthday;


}



package com.alishevcrud.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private int id;
    @NotNull(message = "author should not be empty.")
    private String author;
    @NotNull(message = "title should not be empty.")
    private String title;

    @Min(value = 1500, message = "Year should not be smaller than 1500.")
    private String year;


}

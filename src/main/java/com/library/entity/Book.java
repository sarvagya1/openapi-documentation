package com.library.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Data
public class Book {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @NotBlank
    @Size(min = 0, max = 20)
    @Column
    private String title;

    @NotBlank
    @Size(min = 0, max = 30)
    @Column
    private String author;

    @Column
    private String price;
}

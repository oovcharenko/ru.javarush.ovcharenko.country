package ru.javarush.ovcharenko.country.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(schema = "world", name = "city")
public class City {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "country_id")
    private Integer country_id;

    @Column(name = "distinct")
    private String distinct;

    @Column(name = "population")
    private Integer population;


}

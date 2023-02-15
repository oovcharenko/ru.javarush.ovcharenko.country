package ru.javarush.ovcharenko.country.entity;

import jakarta.persistence.*;

@Entity
@Table(schema = "world", name = "city")
@Getter
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    private String district;

    private Integer population;


}

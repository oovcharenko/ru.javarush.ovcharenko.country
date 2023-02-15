package ru.javarush.ovcharenko.country.dao;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import ru.javarush.ovcharenko.country.entity.Country;

import java.util.List;

public class CountryDAO {
    private final SessionFactory sessionFactory;

    public CountryDAO(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<Country> getAll(){
        Query<Country> query = sessionFactory.getCurrentSession().createQuery("select c from Country c", Country.class);
        return query.list();
    }
}

package ru.javarush.ovcharenko.country;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.hibernate.SessionFactory;
import io.lettuce.core.RedisClient;
import ru.javarush.ovcharenko.country.dao.CityDAO;
import ru.javarush.ovcharenko.country.dao.CountryDAO;

public class Main {
    private final SessionFactory sessionFactory;
    private final RedisClient redisClient;

    private final ObjectMapper mapper;

    private final CityDAO cityDAO;
    private final CountryDAO countryDAO;

    public static void main(String[] args) {

    }

    public Main(){
        sessionFactory = prepareRelationDb();
        cityDAO = new CityDAO(sessionFactory);
        countryDAO = new CountryDAO(sessionFactory);

        redisClient = prepareRedisClient();
        mapper = new ObjectMapper();
    }
}
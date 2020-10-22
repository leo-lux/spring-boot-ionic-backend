package com.leonardo.cursomc.config;

import java.text.ParseException;

import com.leonardo.cursomc.services.DBService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test")
public class TestConfig {

    @Autowired
    private DBService dbservice;

    @Bean
    public boolean instantiateDatabase() throws ParseException {
        dbservice.instantiateTestDatabase();
        return true;
    }
}

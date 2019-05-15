package com.stackroute.domain.config;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan("com.stackroute.domain")

public class AppConfig

{
//    //@Autowired
//    public Movie getMovieBean()
//    {
//        return new Movie("ABCD2","Remo",new Actor("Varun",25,"Male"));
//    }
//
//  @Autowired
//    public Actor getBeanActor()
//    {
//        return new Actor("Varun",25,"Male");
//    }
}


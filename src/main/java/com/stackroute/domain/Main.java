
package com.stackroute.domain;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import com.stackroute.domain.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    public static void main(String[] args)
    {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
        annotationConfigApplicationContext.register(AppConfig.class);
        annotationConfigApplicationContext.refresh();
        Movie movie=(Movie)annotationConfigApplicationContext.getBean("movie");
        Actor actor=(Actor)annotationConfigApplicationContext.getBean("actor");
        //System.out.println(movie);
        System.out.println(actor);
    }
}

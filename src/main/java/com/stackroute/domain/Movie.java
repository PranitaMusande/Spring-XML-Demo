package com.stackroute.domain;

public class Movie
{
    private Actor actor;
    private String name;

    public Movie() {
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                ", name='" + name + '\'' +
                '}';
    }

    public Movie(Actor actor, String name) {
        this.actor = actor;
        this.name = name;
    }


}

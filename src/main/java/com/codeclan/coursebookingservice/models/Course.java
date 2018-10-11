package com.codeclan.coursebookingservice.models;

public class Course {
    private Long id;

    private String name;

    private String location;

    private int starRating;

    public Course(String name, String location, int starRating) {
        this.name = name;
        this.location = location;
        this.starRating = starRating;
    }

    public Course(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }
}

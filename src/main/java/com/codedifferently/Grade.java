package com.codedifferently;

public class Grade {
    private String name;
    private String assignment;
    private Double score;

    public Grade(String nameIn, String assignmentIn, Double scoreIn){
        this.name = nameIn;
        this.assignment = assignmentIn;
        this.score = scoreIn;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAssignment(){
        return assignment;
    }

    public void setAssignment(String assignment){
        this.assignment = assignment;
    }

    public Double getScore(){
        return score;
    }

    public void setScore(Double score){
        this.score = score;
    }
}

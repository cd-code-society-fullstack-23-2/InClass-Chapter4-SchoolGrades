package com.codedifferently;

public class GradeBook {
    private Grade[] grades;

    public GradeBook(Integer size){
        grades = new Grade[size];
    }

    public Boolean addGrade(Grade grade){
        for(int x = 0 ; x < grades.length; x++){
            Grade current = grades[x];
            if(current == null){
                grades[x] = grade;
                return true;
            }
        }
        return false;
    }

    public Integer size(){
        Integer size = 0;
        for(int x = 0; x < grades.length; x++){
            Grade current = grades[x];
            if(current != null){
                size += 1;
            }
        }
        return size;
    }
}

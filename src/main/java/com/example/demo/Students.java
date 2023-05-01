package com.example.demo;

public class Students extends People<Student>{

    public Students(Student... students){
        super(Arrays.asList(students));
    }
    
    @Override
    public Iterator<Student> iterator(){
        return findAll().iterartor();
    }

}

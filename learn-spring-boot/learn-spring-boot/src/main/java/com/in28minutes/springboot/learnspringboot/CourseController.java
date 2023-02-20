package com.in28minutes.springboot.learnspringboot;

/*
* http://localhost:8080/courses
* [
*   {
*       "id" : 1,
*       "name" : "Spring-Boot-Course",
*       "author" : "Alp"
*   }
* ]
* */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses() {
        return Arrays.asList(
                new Course(1,"Spring-Boot-Course","Alp"),
                new Course(2,"AWS-Course","Oz"),
                new Course(3,"Java-Course","AB"),
                new Course(4,"Microservices-Course","A2Z")
        );
    }
}

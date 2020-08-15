package com.example.demo.service;

import com.example.demo.model.Course;
import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Component
public class CourseService {
    private List<Course> courseList;

    CourseService(){
        courseList = new ArrayList<>();
        courseList.add(new Course(UUID.randomUUID(),"Programming Foundation", 10, 79.99, true ));
        courseList.add(new Course(UUID.randomUUID(),"Spring Framework", 20, 149.99, true ));
        courseList.add(new Course(UUID.randomUUID(),"Java EE Framework", 20, 149.99, true ));
        courseList.add(new Course(UUID.randomUUID(),"Web Foundation", 10, 79.99, true ));
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CourseService;
    }

}

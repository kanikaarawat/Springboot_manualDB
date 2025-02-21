package com.example.EXPT3.services;

import com.example.EXPT3.entities.Course;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    private List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(1, "DSA", "Algorithms"));
        list.add(new Course(2, "DAA", "Structures"));
    }

    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourseById(long id) {
        return list.stream().filter(course -> course.getId() == id).findFirst().orElse(null);
    }

    @Override
    public Course addCourse(Course course) {
        list.add(course);
        return course;
    }

    @Override
    public Course updateCourse(long id, Course course) {
        for (Course c : list) {
            if (c.getId() == id) {
                c.setTitle(course.getTitle());
                c.setDescription(course.getDescription());
                return c;
            }
        }
        return null;
    }

    @Override
    public void deleteCourse(long id) {
        list.removeIf(course -> course.getId() == id);
    }
}

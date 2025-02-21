package com.example.EXPT3.services;

import com.example.EXPT3.entities.Course;
import java.util.List;

public interface CourseService {
    List<Course> getCourses();         // GET all courses
    Course getCourseById(long id);     // GET course by ID
    Course addCourse(Course course);   // POST new course
    Course updateCourse(long id, Course course); // PUT update course
    void deleteCourse(long id);        // DELETE course
}

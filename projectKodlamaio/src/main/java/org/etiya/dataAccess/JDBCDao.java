package org.etiya.dataAccess;

import org.etiya.entities.Category;
import org.etiya.entities.Course;
import org.etiya.entities.Instructor;

public class JDBCDao implements InstructorDao,CategoryDao,CourseDao{

    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanina eklendi");
        System.out.println("*****************************************");

    }

    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanina eklendi");
        System.out.println("*****************************************");

    }

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanina eklendi");
        System.out.println("******************************************");


    }

}
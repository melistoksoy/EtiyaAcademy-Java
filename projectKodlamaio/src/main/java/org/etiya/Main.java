package org.etiya;

import org.etiya.business.CategoryManager;
import org.etiya.business.CourseManager;
import org.etiya.business.InstructorManager;
import org.etiya.core.logging.DatabaseLogger;
import org.etiya.core.logging.EmailLogger;
import org.etiya.core.logging.FileLogger;
import org.etiya.dataAccess.HibernateDao;
import org.etiya.dataAccess.JDBCDao;
import org.etiya.entities.Category;
import org.etiya.entities.Course;
import org.etiya.entities.Instructor;
import org.etiya.core.logging.Logger;

import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Instructor instructor1 = new Instructor("Engin", " Demirog");
        Category category1 = new Category(1, "Java");
        Category category2 = new Category(2, "OOP");

        ArrayList<Category> categoryList = new ArrayList<>();
        ArrayList<Course> courses = new ArrayList<>();

        Course course1 = new Course(1, "Python OOP ileri", 45);
        Course course2 = new Course(2, "Java baslangic", 169.99);

        Logger[] loggers = {new DatabaseLogger(), new FileLogger(), new EmailLogger()};
        InstructorManager instructorManager = new InstructorManager(new JDBCDao(), loggers);
        instructorManager.add(instructor1);

        CategoryManager categoryManager = new CategoryManager(new JDBCDao(), categoryList, loggers);
        categoryManager.add(category1);
        categoryManager.add(category2);

        CourseManager courseManager = new CourseManager(new HibernateDao(), loggers, courses);
        courseManager.add(course1);
        courseManager.add(course2);

    }
}
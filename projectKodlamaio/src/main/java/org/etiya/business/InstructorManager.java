package org.etiya.business;

import org.etiya.dataAccess.InstructorDao;
import org.etiya.entities.Instructor;
import org.etiya.core.logging.Logger;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao,Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {

        instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getName()+instructor.getLastName());

        }

    }




}
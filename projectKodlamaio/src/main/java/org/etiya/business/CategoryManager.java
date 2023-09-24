package org.etiya.business;

import org.etiya.dataAccess.CategoryDao;
import org.etiya.entities.Category;
import org.etiya.core.logging.Logger;

import java.util.ArrayList;

public class CategoryManager {
    private CategoryDao categoryDao;
    private ArrayList<Category> categories;
    private	Logger[] loggers;

    public CategoryManager(CategoryDao categoryDao,ArrayList<Category> categories,Logger[] loggers) {
        this.categoryDao = categoryDao;
        this.categories = categories;
        this.loggers = loggers;
    }


    public void add(Category category) throws Exception{
        for (Category category1 : categories) {
            if(category.getCategoryName() == category1.getCategoryName()) {
                throw new Exception("kategori ismi aynı olamaz");

            }

        }

        for (Logger logger : loggers) {

            logger.log(category.getCategoryName());
        }

        categoryDao.add(category);
        categories.add(category);

    }

}
package org.etiya;

import org.etiya.business.ProductManager;
import org.etiya.core.logging.DatabaseLogger;
import org.etiya.core.logging.FileLogger;
import org.etiya.core.logging.Logger;
import org.etiya.dataAccess.HibernateProductDao;
import org.etiya.entities.Product;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Product(1, "iphone", 10000);


        List<Logger> loggers =new ArrayList<Logger>(List.of(new FileLogger(), new DatabaseLogger()));
        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers);
        productManager.add(product);

    }
}
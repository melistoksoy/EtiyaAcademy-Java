package org.etiya.dataAccess;

import org.etiya.entities.Product;

public class JDBCProductDao implements ProductDao {


    @Override
    public void add(Product product) {
        System.out.println("adding with jdbc");
    }
}

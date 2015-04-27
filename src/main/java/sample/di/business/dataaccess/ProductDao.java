package sample.di.business.dataaccess;

import sample.di.business.domain.Product;

public interface ProductDao {

    Product findProduct(String name);
    
}

package sample.di.business.dataaccess;

import org.springframework.stereotype.Component;

import sample.di.business.domain.Product;

@Component
public class ProductDaoImpl implements ProductDao {

    @Override
    public Product findProduct(String name) {
        // DB Access mock
        return new Product(name, 100);
    }

}

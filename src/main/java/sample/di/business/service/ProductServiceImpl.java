package sample.di.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample.di.business.dataaccess.ProductDao;
import sample.di.business.domain.Product;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;
    
    @Override
    public Product findProduct(String name) {
        return productDao.findProduct(name);
    }

    // applicationContext.xmlで bean定義する場合は、必要
//    public void setProductDao(ProductDao productDao) {
//        this.productDao = productDao;
//    }

    
}

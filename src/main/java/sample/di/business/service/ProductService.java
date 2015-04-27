package sample.di.business.service;

import sample.di.business.domain.Product;

/**
 * 
 * @author aloha.wave
 *
 */
public interface ProductService {

    Product findProduct(String name);
}

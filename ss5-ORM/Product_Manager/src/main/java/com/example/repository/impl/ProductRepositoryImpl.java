package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.ProductRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    @Override
    public List<Product> findAll() {
        List<Product> products = BaseRepository.entityManager.createQuery("SELECT p FROM Product  p",
                Product.class).getResultList();
        return products;
    }

    @Transactional
    @Override
    public void save(Product product) {
        BaseRepository.entityManager.getTransaction().begin();
        BaseRepository.entityManager.persist(product);
        BaseRepository.entityManager.getTransaction().commit();
    }

    @Override
    public Product findById(int id) {
        Product product = BaseRepository.entityManager.createQuery("select p from Product p where id =? 1",
                Product.class).setParameter(1, id).getSingleResult();
        return product;
    }

    @Override
    @Transactional
    public void update(Product product) {
        BaseRepository.entityManager.getTransaction().begin();
        BaseRepository.entityManager.merge(product);
        BaseRepository.entityManager.getTransaction().commit();
    }

    @Override
    public void remove(int id) {
        BaseRepository.entityManager.getTransaction().begin();
        Product product = this.findById(id);
        BaseRepository.entityManager.remove(product);
        BaseRepository.entityManager.getTransaction().commit();
    }
}

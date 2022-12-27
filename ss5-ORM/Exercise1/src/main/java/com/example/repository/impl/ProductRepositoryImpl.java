package com.example.repository.impl;

import com.example.model.Product;
import com.example.repository.ProductRepository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Product> findAll() {
        TypedQuery<Product> query = em.createQuery("SELECT  p FROM Product p", Product.class);
        return query.getResultList();
    }

    @Override
    public void save(Product product) {
        if (product.getId() >= 0) {
            em.merge(product);
        } else {
            em.persist(product);
        }
    }

    @Override
    public Product findById(int id) {
        TypedQuery<Product> query = em.createQuery("SELECT p FROM Product p WHERE p.id=:id", Product.class);
        query.setParameter("id", id);
        try {
            return query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void remove(int id) {
        Product product = this.findById(id);
        if (product != null) {
            em.remove(product);
        }
    }
}

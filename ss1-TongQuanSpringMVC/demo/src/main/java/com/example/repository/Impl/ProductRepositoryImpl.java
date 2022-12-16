package com.example.repository.Impl;

import com.example.model.Category;
import com.example.model.Product;
import com.example.repository.ProductRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    public static final String INSERT_PRODUCT = "INSERT INTO product(product_id, product_name, price, manufacture, description, category_id) VALUES (?, ?, ?, ?, ?, ?)";
    public static final String DELETE_PRODUCT = "DELETE FROM product WHERE product_id = ?";
    public static final String SELECT_FROM_PRODUCT = "SELECT * FROM product JOIN category USING (category_id)";
    public static final String SELECT_PRODUCT_BY_Name = "SELECT * FROM product JOIN category USING (category_id) WHERE product_name LIKE ?";
    public static final String UPDATE_PRODUCT = "UPDATE product SET product_id = ?, product_name = ?, price = ?, manufacture = ?, description = ?, category_id = ? WHERE product_id = ?";
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public void save(Product product) {
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement ps = connection.prepareStatement(INSERT_PRODUCT);
            ps.setInt(1, product.getId());
            ps.setString(2, product.getName());
            ps.setFloat(3, product.getPrice());
            ps.setString(4, product.getManufacture());
            ps.setString(5, product.getDesc());
            ps.setInt(6, product.getCategory().getId());
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(int id) {
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement ps = connection.prepareStatement(DELETE_PRODUCT);
            ps.setInt(1, id);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(int id, Product product) {
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement ps = connection.prepareStatement(UPDATE_PRODUCT);
            ps.setInt(1, product.getId());
            ps.setString(2, product.getName());
            ps.setFloat(3, product.getPrice());
            ps.setString(4, product.getManufacture());
            ps.setString(5, product.getDesc());
            ps.setInt(6, product.getCategory().getId());
            ps.setInt(7, id);
            ps.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Product> findAll() {
        List<Product> productList = new ArrayList<>();
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement ps = connection.prepareStatement(SELECT_FROM_PRODUCT);
            ResultSet resultSet = ps.executeQuery();
            Product product;
            Category category;
            while (resultSet.next()) {
                product = new Product();
                product.setId(resultSet.getInt("product_id"));
                product.setName(resultSet.getString("product_name"));
                product.setPrice(resultSet.getFloat("price"));
                product.setManufacture(resultSet.getString("manufacture"));
                product.setDesc(resultSet.getString("description"));
                int id = resultSet.getInt("category_id");
                String name = resultSet.getString("category_name");
                category = new Category(id, name);
                product.setCategory(category);
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return productList;
    }

    @Override
    public List<Product> search(String name) {
        List<Product> listSearch = new ArrayList<>();
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement ps = connection.prepareStatement(SELECT_PRODUCT_BY_Name);
            ps.setString(1, "%"+name+"%");
            ResultSet resultSet = ps.executeQuery();
            Product product;
            Category category;
            while (resultSet.next()) {
                product = new Product();
                product.setId(resultSet.getInt("product_id"));
                product.setName(resultSet.getString("product_name"));
                product.setPrice(resultSet.getFloat("price"));
                product.setManufacture(resultSet.getString("manufacture"));
                product.setDesc(resultSet.getString("description"));
                int categoryId = resultSet.getInt("category_id");
                String categoryName = resultSet.getString("category_name");
                category = new Category(categoryId, categoryName);
                product.setCategory(category);
                listSearch.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSearch;
    }
}

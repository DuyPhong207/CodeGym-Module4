package com.example.repository.Impl;

import com.example.model.Category;
import com.example.repository.CategoryRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepositoryImpl implements CategoryRepository {
    public static final String SELECT_CATEGORY_BY_ID = "SELECT * FROM category WHERE category_id = ?";
    private BaseRepository baseRepository = new BaseRepository();

    @Override
    public Category getById(int id) {
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement ps = connection.prepareStatement(SELECT_CATEGORY_BY_ID);
            ps.setInt(1, id);
            ResultSet resultSet = ps.executeQuery();
            Category category = new Category();
            while (resultSet.next()) {
                category.setId(resultSet.getInt("category_id"));
                category.setName(resultSet.getString("category_name"));
            }
            return category;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Category> findAll() {
        List<Category> categoryList = new ArrayList<>();
        try {
            Connection connection = this.baseRepository.getConnectionJavaToDB();
            PreparedStatement ps = connection.prepareStatement("SELECT * FROM category");
            ResultSet resultSet = ps.executeQuery();
            Category category;
            while (resultSet.next()) {
                category = new Category();
                category.setId(resultSet.getInt("category_id"));
                category.setName(resultSet.getString("category_name"));
                categoryList.add(category);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return categoryList;
    }
}

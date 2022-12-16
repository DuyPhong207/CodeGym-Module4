package com.example.repository;

import com.example.model.Category;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface CategoryRepository {
    Category getById(int id);
    List<Category> findAll();
}

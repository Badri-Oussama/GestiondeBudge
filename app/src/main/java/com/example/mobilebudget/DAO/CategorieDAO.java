package com.example.mobilebudget.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.mobilebudget.Module.Categorie;
import com.example.mobilebudget.Module.User;

import java.util.List;

@Dao
public interface CategorieDAO {
    @Insert
    void insertCategorie(Categorie categorie);

    @Query("SELECT * FROM categorie")
    List<Categorie> getAllCategories();

    @Query("SELECT * FROM categorie WHERE categoryId = :categoryId")
    Categorie getCategoryById(int categoryId);

    @Update
    void updateCategorie(Categorie categorie);

    @Delete
    void deleteCategorie(Categorie categorie);
}

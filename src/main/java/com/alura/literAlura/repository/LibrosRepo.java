package com.alura.literAlura.repository;

import com.alura.literAlura.models.Libro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LibrosRepo extends JpaRepository<Libro, Integer> {
    @Query("SELECT l FROM Libro l WHERE l.language ILIKE %:language%")
    List<Libro> findByLanguage(String language);
}


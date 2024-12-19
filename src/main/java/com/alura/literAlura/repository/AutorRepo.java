package com.alura.literAlura.repository;

import com.alura.literAlura.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AutorRepo extends JpaRepository<Autor, Integer> {
    @Query("SELECT a FROM Autor a WHERE a.birth_day >= :year ORDER BY a.birth_day ASC")
    List<Autor> getAuthorByDate(Integer year);
}
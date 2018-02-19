package com.project.servicedatabase.repositories;

import com.project.servicedatabase.models.Quotes;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Quotesrepository extends JpaRepository<Quotes, Integer> {
    List<Quotes> findByUserName(String username);
}
package com.example.CRUDDD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.CRUDDD.model.User; // Kendi model sınıfını ekle

public interface UserRepository extends JpaRepository<User, Long> {
}

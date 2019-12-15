package com.sergioramos.curso.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import com.sergioramos.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}

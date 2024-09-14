package com.example.www.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.www.model.User;

@Repository
public interface UserRepository  extends JpaRepository<User, Long>{

}

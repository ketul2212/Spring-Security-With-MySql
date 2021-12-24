package com.ketul.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ketul.module.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

	public User findByName(String name);
}

package com.syafiqh.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.syafiqh.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User,Long> {
}

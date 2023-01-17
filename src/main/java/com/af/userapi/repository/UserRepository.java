package com.af.userapi.repository;

import com.af.userapi.entity.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	User findById(int id);

	public List<User> findByUserName(String userName);

	public List<User> findByBirthDate(LocalDate birthDate);

}  
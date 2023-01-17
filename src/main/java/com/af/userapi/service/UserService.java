package com.af.userapi.service;


import java.time.LocalDate;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import com.af.userapi.repository.UserRepository;
import com.af.userapi.entity.*;

@Service
@Transactional
public class UserService<User> {
	@Autowired
	UserRepository userRepository;

	@Autowired
	public UserService(UserRepository UserRepository) {
		this.userRepository = UserRepository;
	}

	public User findById(int id) throws NullPointerException {

		User user = (User) userRepository.findById(id);
		if (user == null) {
			throw new NullPointerException();
		}
		return (User) userRepository.findById(id);

	}

	public List<User> findAllUsersByBirthDate(LocalDate birthDate) {
		return (List<User>) userRepository.findByBirthDate(birthDate);
	}




}

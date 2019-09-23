package com.example.demo.repository;

import com.example.demo.model.LoginDto;

public interface LoginRepo {

	LoginDto findByUsername(String username);

	LoginDto findByEmail(String email);
}

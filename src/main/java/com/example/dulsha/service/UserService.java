package com.example.dulsha.service;

import com.example.dulsha.dto.UserDTO;
import com.example.dulsha.entity.User;
import com.example.dulsha.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;
    public String saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));

    }

}

package com.msb.service;

import com.msb.pojo.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    List<User>findAll();
}

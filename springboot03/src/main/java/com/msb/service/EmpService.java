package com.msb.service;

import com.msb.pojo.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmpService {
    List<Emp> findAll();

    List<Emp> findByPage(Integer pageNum, Integer pageSize);


}

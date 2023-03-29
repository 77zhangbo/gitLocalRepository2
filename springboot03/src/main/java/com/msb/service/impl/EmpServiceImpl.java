package com.msb.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.msb.mapper.EmpMapper;
import com.msb.pojo.Emp;
import com.msb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> findAll() {
        return empMapper.findAll();
    }

    @Override
    public List<Emp> findByPage(Integer pageNum, Integer pageSize) {

        PageHelper.startPage(pageNum, pageSize);
        List<Emp> list = empMapper.findAll();
        //要返回： 页码    页大小    总页数     总记录数   当前页数据

        //方式1   不推荐
//        System.out.println("当前页:"+page.getPageNum());
//        System.out.println("页大小:"+page.getPageSize());
//        System.out.println("总页数:"+page.getPages());
//        System.out.println("总记录数:"+page.getTotal());
//        System.out.println("当前页数据:"+page.getResult());

        //方式2
        PageInfo<Emp> pi=new PageInfo<>(list);
        System.out.println("当前页:"+pi.getPageNum());
        System.out.println("页大小:"+pi.getPageSize());
        System.out.println("总页数:"+pi.getPages());
        System.out.println("总记录数:"+pi.getTotal());
        System.out.println("当前页数据:"+pi.getList());
        System.out.println("是否第一页:"+pi.isIsFirstPage());
        System.out.println("有没有上一页:"+pi.isHasPreviousPage());
        System.out.println("下一页:"+pi.getNextPage());
        System.out.println("有没有下一页:"+pi.isHasNextPage());
        System.out.println("是否是最后一页:"+pi.isIsLastPage());
        return list;
    }
}

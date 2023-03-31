package com.msb.controller;

import com.msb.pojo.Emp;
import com.msb.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FreeMarkerController {


    @Autowired
    private EmpService empService;

    /**
     * 遍历map集合，输出员工信息
     * @return
     */
    @RequestMapping("/showEmpMap")
    public ModelAndView testMap(){
        ModelAndView mv =new ModelAndView();
        List<Emp> list = empService.findAll();
        Map<String,Emp> empMap=new HashMap<>();
        for (Emp emp : list) {
            empMap.put(emp.getEmpno().toString(),emp); //以工号为 key 值来实现查询
        }
        mv.addObject("empMap",empMap);
        mv.setViewName("showEmpMap");  //  .ftlh 文件名
        return mv;
    }

    /**
     * 查询全部的员工信息，展示
     * 遍历list集合
     * @return
     */
    @RequestMapping("/showEmp")
    public ModelAndView testList(){
        ModelAndView mv=new ModelAndView();
        List<Emp> list = empService.findAll();
        mv.addObject("empList",list);
        mv.setViewName("showEmp");  //返回showEmp.ftlh
        return mv;
    }

    /**
     * 整合freemarker
     * @param map
     * @return
     */
    @RequestMapping("/show")
    public String freemarker(Map<String,Object>map){
        map.put("name","77zhang");
        return "show";
    }
}

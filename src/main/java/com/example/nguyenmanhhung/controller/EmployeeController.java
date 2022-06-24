package com.example.nguyenmanhhung.controller;

import com.example.nguyenmanhhung.entity.EmployeeEntity;
import com.example.nguyenmanhhung.service.EmployeeService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/", "/index"})
    public String index(Model model){
        List<EmployeeEntity> employees = employeeService.findAllEmployee();
        model.addAttribute("employees", employees);
        return "index";
    }

    @PostMapping("/create")
    public String createEmployee(Model model, @RequestParam Map<String, String> param){
        System.out.println(param);
        String name = param.get("name");
        String wage = param.get("wage");
        EmployeeEntity e = new EmployeeEntity(name, wage);
        employeeService.createEmployee(e);
        return "redirect:/index";
    }
}

package com.example.h2demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
public class MyControllor {
    @Autowired
    MyService svc;

    @Autowired
    MyRepostory rep ;

    // update/123?tel=999
    @RequestMapping("/update/{id}")
    public Emp update(@PathVariable("id") Long pid, @RequestParam("tel") String tel) {
//        Long pid = Long.valueOf(id);
        Optional<Emp> empRet = rep.findById(pid);
        if(!empRet.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "emp not found");
        }

        Emp emp = empRet.get();
        emp.setTel(tel);
        svc.update(emp);

        return emp;
    }

    @RequestMapping("/update2/{id}")
    public Emp update2(@PathVariable("id") Long pid, @RequestParam("addr") String addr) {
        Optional<Emp> empRet = rep.findById(pid);
        if(!empRet.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "emp not found");
        }

        Emp emp = empRet.get();
        emp.setAddr(addr);
        svc.update(emp);

        return emp;
    }

    @RequestMapping("/get/{id}")
    public Emp get(@PathVariable("id") String id) {
        Long pid = Long.valueOf(id);
        Optional<Emp> empRet = rep.findById(pid);
        if(!empRet.isPresent()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "emp not found");
        }
        return empRet.get();
    }
}

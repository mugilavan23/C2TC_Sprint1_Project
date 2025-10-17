package com.tnsif.adminservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.tnsif.adminservices.entity.Admin;
import com.tnsif.adminservices.service.AdminService;

import jakarta.persistence.NoResultException;

@RestController
public class AdminController {

    @Autowired
    private AdminService a;

    @GetMapping("/adminservice")
    public List<Admin> list() {
        return a.listAll();
    }

    @PostMapping("/adminservice")
    public void add(@RequestBody Admin a1) {
        a.save(a1);
    }

    @GetMapping("/adminservice/{id}")
    public ResponseEntity<Admin> get(@PathVariable Integer id) {
        try {
            Admin a2 = a.get(id);
            return new ResponseEntity<Admin>(a2, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/adminservice/{id}")
    public void delete(@PathVariable Integer id) {
        a.delete(id);
    }

    @PutMapping("/adminservice/{id}")
    public ResponseEntity<Admin> update(@PathVariable Integer id, @RequestBody Admin update_a) {
        try {
            Admin exist_a = a.get(id);
            exist_a.setA_name(update_a.getA_name());
            exist_a.setEmail(update_a.getEmail());
            exist_a.setPassword(update_a.getPassword());
            a.update(exist_a);
            return new ResponseEntity<Admin>(exist_a, HttpStatus.OK);
        } catch (NoResultException e) {
            return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
        }
    }
}

package com.tnsif.adminservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tnsif.adminservices.entity.Admin;
import com.tnsif.adminservices.repository.AdminRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AdminService {

    @Autowired
    private AdminRepository repo;

    // Get all admins
    public List<Admin> listAll() {
        return repo.findAll();
    }

    // Save new admin
    public void save(Admin a) {
        repo.save(a);
    }

    // Get specific admin
    public Admin get(Integer aid) {
        return repo.findById(aid).get();
    }

    // Delete admin
    public void delete(Integer aid) {
        repo.deleteById(aid);
    }

    // Update admin
    public void update(Admin a) {
        repo.save(a);
    }
}

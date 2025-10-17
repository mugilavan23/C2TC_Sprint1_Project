package com.tnsif.adminservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.adminservices.entity.Admin;

public interface AdminRepository extends JpaRepository<Admin, Integer> {

}

package com.greatlearning.admin.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.admin.entity.Admin;

@Repository
public interface AdminRepo extends JpaRepository<Admin, Integer>{

	Admin findByAdminName(String adminName);

}

package com.poly.AssignmentJava5.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.AssignmentJava5.entity.DanhMuc;

public interface DanhMucDAO extends JpaRepository<DanhMuc, Integer>{
}

package com.poly.AssignmentJava5.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.AssignmentJava5.entity.KhachHang;

public interface KhachHangDAO extends JpaRepository<KhachHang, String>{
	@Query("SELECT o FROM KhachHang o WHERE o.makh=?1")
	List<KhachHang> khachHangFindId(String makh);
}

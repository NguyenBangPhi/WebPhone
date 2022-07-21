package com.poly.AssignmentJava5.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.AssignmentJava5.entity.ChiTietHoaDon;
import com.poly.AssignmentJava5.entity.Report;

public interface ChiTietHoaDonDAO extends JpaRepository<ChiTietHoaDon, Integer>{
	@Query("SELECT o FROM ChiTietHoaDon o WHERE o.hoadon.mahd=?1")
	List<ChiTietHoaDon> listById(Integer mahd);
	
	@Query("SELECT new Report(o.hoadon,sum(o.dongia),count(o)) FROM ChiTietHoaDon o GROUP BY o.hoadon ORDER BY sum(o.dongia) DESC")
	List<Report> getInventoryByCategory();
}

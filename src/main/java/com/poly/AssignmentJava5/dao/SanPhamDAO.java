package com.poly.AssignmentJava5.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.poly.AssignmentJava5.entity.SanPham;

public interface SanPhamDAO extends JpaRepository<SanPham, Integer>{
//	@Query(value = "select * from SanPham where madm=:iddm",nativeQuery = true)
//	List<SanPham> findByDanhMucId(@Param("iddm") int iddm);
	
	@Query("SELECT o FROM SanPham o WHERE o.danhmuc.madm=?1")
	List<SanPham> findByDanhMucId(Integer iddm);
	
	@Query("SELECT o FROM SanPham o")
	List<SanPham> sortSanPham(Sort sort);
	
	@Query("SELECT o FROM SanPham o")
	List<SanPham> sortSanPhamPage(Sort sort);
	
	@Query("SELECT o FROM SanPham o")
	Page<SanPham> pageAll(Pageable pageable);
	
	@Query("SELECT o FROM SanPham o WHERE o.danhmuc.madm=?1")
	Page<SanPham> pageFindIdDM(Integer iddm,Pageable pageable);
	
	@Query("SELECT o FROM SanPham o WHERE o.dongia BETWEEN ?1 and ?2")
	Page<SanPham> pageByDongiaBetween(double min,double max,Pageable pageable);
	
	@Query("SELECT o FROM SanPham o WHERE o.danhmuc.madm=?1 AND o.dongia BETWEEN ?2 AND ?3")
	Page<SanPham> pageDMDonGia(Integer iddm,double min,double max,Pageable pageable);
	//List<SanPham> findByDongiaBetween(double min,double max);
}

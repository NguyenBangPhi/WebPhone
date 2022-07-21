
package com.poly.AssignmentJava5.dao;



import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.AssignmentJava5.entity.HoaDon;
import com.poly.AssignmentJava5.entity.Report;

public interface HoaDonDAO extends JpaRepository<HoaDon, Integer>{
	@Query("SELECT o FROM HoaDon o")
	Page<HoaDon> findAllSort(Pageable pageable);
	
	@Query("SELECT o FROM HoaDon o WHERE o.ngaylaphd BETWEEN ?1 AND ?2")
	Page<HoaDon> findDateSort(Date date1,Date date2,Pageable pageable);
	
	
}

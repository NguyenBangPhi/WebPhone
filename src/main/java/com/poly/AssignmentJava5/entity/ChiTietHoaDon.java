package com.poly.AssignmentJava5.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "Chitiethoadon",uniqueConstraints = {
		@UniqueConstraint(columnNames = {"maHD","maSP"})
})
public class ChiTietHoaDon implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer idhdct;
	
	@ManyToOne @JoinColumn(name = "mahd")
	HoaDon hoadon;
	
	@ManyToOne @JoinColumn(name = "masp")
	SanPham sanpham;
	
	Double dongia;
	Integer soluong;
	Double tongtien;
	
	
}

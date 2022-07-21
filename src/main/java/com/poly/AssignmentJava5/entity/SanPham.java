package com.poly.AssignmentJava5.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "Sanpham")
public class SanPham implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer masp;
	String tensp;
	Double dongia;
	Integer soluonghang;
	String hinh;
	@ManyToOne @JoinColumn(name = "madm")
	DanhMuc danhmuc;
	@OneToMany(mappedBy = "sanpham")
	List<ChiTietHoaDon> cthd;
	
}

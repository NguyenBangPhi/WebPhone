package com.poly.AssignmentJava5.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "Hoadon")
public class HoaDon implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer mahd;
	Double tongtien;
	@Temporal(TemporalType.DATE)
	Date ngaylaphd = new Date();
	@ManyToOne @JoinColumn(name = "makh")
	KhachHang khachhang;
	@ManyToOne @JoinColumn(name = "manv")
	NhanVien nhanvien;
	String diachinh;
	Boolean trangthai;
	String sdt;
	
	@OneToMany(mappedBy = "hoadon")
	List<ChiTietHoaDon> listHDCT;
	
}

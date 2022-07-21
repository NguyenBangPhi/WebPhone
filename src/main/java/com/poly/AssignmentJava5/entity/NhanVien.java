package com.poly.AssignmentJava5.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
@Table(name = "Nhanvien")
public class NhanVien implements Serializable{
	@Id
	String manv;
	String tennv;
	Boolean gioitinh;
	@Temporal(TemporalType.DATE)
	Date ngaysinh = new Date();
	String diachi;
	String password;
	
	@OneToMany(mappedBy = "nhanvien")
	List<HoaDon> hoadon;
}

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
@Table(name = "Khachhang")
public class KhachHang implements Serializable{
	@Id
	String makh;
	String tenkh;
	Boolean gioitinh;
	@Temporal(TemporalType.DATE)
	Date ngaysinh = new Date();
	String diachi;
	String password;
	String email;
	
	@OneToMany(mappedBy = "khachhang")
	List<HoaDon> hoadon;
}

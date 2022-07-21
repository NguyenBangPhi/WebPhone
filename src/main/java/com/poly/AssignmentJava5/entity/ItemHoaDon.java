package com.poly.AssignmentJava5.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemHoaDon {
	SanPham sp;
	int soluong;
	double tongtien;
}

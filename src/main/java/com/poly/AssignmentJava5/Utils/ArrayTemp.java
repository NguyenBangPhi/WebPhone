package com.poly.AssignmentJava5.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.poly.AssignmentJava5.dao.SanPhamDAO;
import com.poly.AssignmentJava5.entity.ItemHoaDon;
import com.poly.AssignmentJava5.entity.SanPham;

@Service
public class ArrayTemp {
	@Autowired
	SanPhamDAO dao;
	
	public static List<SanPham> listSP;
	
	public static Page<SanPham> pageSP;
	public static Optional<Integer> pageIndex;
	public static Integer iddm;
	public static Sort sorttable;
	
	public static Map<Integer, ItemHoaDon> listItemGioHang = new HashMap<Integer, ItemHoaDon>();
	
}

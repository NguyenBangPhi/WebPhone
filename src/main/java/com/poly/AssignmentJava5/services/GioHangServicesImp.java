package com.poly.AssignmentJava5.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import com.poly.AssignmentJava5.Utils.ArrayTemp;
import com.poly.AssignmentJava5.dao.SanPhamDAO;
import com.poly.AssignmentJava5.entity.ItemHoaDon;
import com.poly.AssignmentJava5.entity.SanPham;





@SessionScope
@Service
public class GioHangServicesImp implements GioHangServices{
	@Autowired
	EntityManager em;
	
	@Autowired
	SanPhamDAO dao;
	
	@Autowired
	ArrayTemp util;
	
	Map<Integer, ItemHoaDon> map = new HashMap<Integer, ItemHoaDon>();
	int check = 0;

	@Override
	public ItemHoaDon add(Integer masp) {
		ItemHoaDon item = map.get(masp);
		if(item == null) {
//			item = util.listItemGioHang.get(masp);
//			item.setSoluong(1);
			map.put(masp, new ItemHoaDon(dao.getOne(masp),1,dao.getOne(masp).getDongia()));
		} else {
			item.setSoluong(item.getSoluong() + 1);
			item.setTongtien(getTongTien(item.getSoluong(), item.getSp().getDongia()));
		}
		return item;
	}
	
	public double getTongTien(int soluong,double dongia) {
		return soluong * dongia;
	}

	@Override
	public void remove(Integer masp) {
		map.remove(masp);
	}

	@Override
	public ItemHoaDon update(Integer masp, int soluong) {
		ItemHoaDon item = map.get(masp);
		item.setSoluong(soluong);
		item.setTongtien(getTongTien(item.getSoluong(), item.getSp().getDongia()));
		return item;
	}

	@Override
	public void clear() {
		map.clear();
		
	}

	@Override
	public Collection<ItemHoaDon> getItems() {
//		if(check == 0) {
//			if(map.isEmpty()) {
//				check++;
//				SimpleJpaRepository<SanPham, Integer> repo = new SimpleJpaRepository<SanPham,Integer >(SanPham.class,em);
//				for (SanPham it : repo.findAll()) {
//					map.put(it.getMasp(), new ItemHoaDon(it,1));
//				}
//			}
//		}
		
		return map.values();
	}

	@Override
	public int getCount() {
		
		return map.values().stream()
				.mapToInt(item -> item.getSoluong())
				.sum();
	}

	@Override
	public double getAmount() {
		return map.values().stream()
				.mapToDouble(item -> item.getSp().getDongia()*item.getSoluong())
				.sum();
	}
	
	
}

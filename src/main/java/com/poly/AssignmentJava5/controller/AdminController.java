package com.poly.AssignmentJava5.controller;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.poly.AssignmentJava5.dao.ChiTietHoaDonDAO;
import com.poly.AssignmentJava5.dao.DanhMucDAO;
import com.poly.AssignmentJava5.dao.HoaDonDAO;
import com.poly.AssignmentJava5.dao.KhachHangDAO;
import com.poly.AssignmentJava5.dao.NhanVienDAO;
import com.poly.AssignmentJava5.dao.SanPhamDAO;
import com.poly.AssignmentJava5.entity.ChiTietHoaDon;
import com.poly.AssignmentJava5.entity.DanhMuc;
import com.poly.AssignmentJava5.entity.HoaDon;
import com.poly.AssignmentJava5.entity.KhachHang;
import com.poly.AssignmentJava5.entity.NhanVien;
import com.poly.AssignmentJava5.entity.Report;
import com.poly.AssignmentJava5.entity.SanPham;

@Controller
@RequestMapping("/index")
public class AdminController {
	
	@Autowired
	NhanVienDAO daonv;
	
	@Autowired
	KhachHangDAO daokh;
	
	@Autowired
	DanhMucDAO daodm;
	
	@Autowired
	SanPhamDAO daosp;
	
	@Autowired
	HoaDonDAO daohd;
	
	@Autowired
	ChiTietHoaDonDAO daocthd;
	
	@Autowired
	HttpServletRequest req;
	
	@Autowired
	ServletContext app;
	
	
	@RequestMapping("/nhanvien")
	public String indexShow(Model model) {
		List<NhanVien> list = daonv.findAll();
		model.addAttribute("listnv", list);
		return "admin/index";
	}
	@RequestMapping("/nhanvien/edit/{id}")
	public String editNhanVien(Model model, @PathVariable("id") String manv) {
		NhanVien entity = daonv.getOne(manv);
		model.addAttribute("entity", entity);
		return "forward:/index/nhanvien";
	}
	
	@RequestMapping("/nhanvien/create")
	public String createNhanVien(Model model,NhanVien nv) throws ParseException {
		//NhanVien entity = daonv.save(nv);
//		String pattern = "MM-dd-yyyy";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		String date = simpleDateFormat.format(nv.getNgaysinh());
//		System.out.println(date);
		String ns = req.getParameter("ns");
		Date ngaysinh = new SimpleDateFormat("yyyy-MM-dd").parse(ns);
		
		System.out.println(ngaysinh.toString());
		System.out.println(nv.getGioitinh());
		nv.setNgaysinh(ngaysinh);
		NhanVien entity = daonv.save(nv);
		return "redirect:/index/nhanvien";
	}
	
	@RequestMapping("/nhanvien/update")
	public String updateNhanVien(Model model,NhanVien nv) throws ParseException {
		String ns = req.getParameter("ns");
		Date ngaysinh = new SimpleDateFormat("yyyy-MM-dd").parse(ns);
		nv.setNgaysinh(ngaysinh);
		NhanVien entity = daonv.save(nv);
		return "redirect:/index/nhanvien";
	}
	
	@RequestMapping("/nhanvien/delete/{id}")
	public String deleteNhanVien(Model model,@PathVariable("id") String manv) {
		daonv.deleteById(manv);
		return "redirect:/index/nhanvien";
	}
	
	@RequestMapping("/khachhang")
	public String indexShow2(Model model) {
		List<KhachHang> listkh = daokh.findAll();
		model.addAttribute("listkh", listkh);
		return "admin/index2";
	}
	
	@RequestMapping("/khachhang/edit/{id}")
	public String editKhachHang(Model model, @PathVariable("id") String makh) {
		KhachHang entity = daokh.getOne(makh);
		model.addAttribute("entity", entity);
		return "forward:/index/khachhang";
	}
	
	@RequestMapping("/khachhang/create")
	public String createKhachHang(KhachHang kh) throws ParseException {
		String ns = req.getParameter("ns");
		Date ngaysinh = new SimpleDateFormat("yyyy-MM-dd").parse(ns);
		
		kh.setNgaysinh(ngaysinh);
		KhachHang entity = daokh.save(kh);
		
		return "redirect:/index/khachhang";
	}
	
	@RequestMapping("/khachhang/update")
	public String updateKhachHang(KhachHang kh) throws ParseException {
		String ns = req.getParameter("ns");
		Date ngaysinh = new SimpleDateFormat("yyyy-MM-dd").parse(ns);
		
		kh.setNgaysinh(ngaysinh);
		KhachHang entity = daokh.save(kh);
		
		return "redirect:/index/khachhang";
		
	}
	
	@RequestMapping("/khachhang/delete/{id}")
	public String deleteKhachHang(@PathVariable("id") String makh) {
		daokh.deleteById(makh);
		return "redirect:/index/khachhang";
	}
	
	@RequestMapping("/sanpham")
	public String indexShow3(Model model) {
		List<SanPham> list = daosp.findAll();
		model.addAttribute("list", list);
		List<DanhMuc> listdm = daodm.findAll();
		model.addAttribute("listdm", listdm);
		return "admin/index3";
	}
	
	@RequestMapping("/sanpham/edit/{id}")
	public String editSanPham(Model model,@PathVariable("id") Integer id) {
		SanPham sp = daosp.getOne(id);
		model.addAttribute("entity", sp);
		
		return "forward:/index/sanpham";
	}
	
	@PostMapping("/sanpham/createandupdate")
	public String createSanPham(Model model,@RequestParam("attach") MultipartFile attach,SanPham sp) throws IllegalStateException, IOException {
		if(sp.getMasp() != null) {
			if(!attach.isEmpty()) {
				String filename = attach.getOriginalFilename();
				File file = new File(app.getRealPath("/customer/images/" + filename));
				attach.transferTo(file);
				//model.addAttribute("nameImg", attach.getOriginalFilename());
			}
			if(!attach.getOriginalFilename().equals("")) {
				sp.setHinh(attach.getOriginalFilename());
			}
			Integer madm = Integer.parseInt(req.getParameter("madm"));
			sp.setDanhmuc(daodm.getOne(madm));
			
			SanPham entity = daosp.save(sp);
			//dm.set
			return "redirect:/index/sanpham";
		}else {
			if(!attach.isEmpty()) {
				String filename = attach.getOriginalFilename();
				File file = new File(app.getRealPath("/customer/images/" + filename));
				attach.transferTo(file);
				//model.addAttribute("nameImg", attach.getOriginalFilename());
			}
			sp.setHinh(attach.getOriginalFilename());
			Integer madm = Integer.parseInt(req.getParameter("madm"));
			sp.setDanhmuc(daodm.getOne(madm));
			SanPham entity = daosp.save(sp);
			return "redirect:/index/sanpham";
		}
		
		//dm.set
		
	}
	
	@RequestMapping("/hoadon")
	public String indexShow4(Model model, @RequestParam("p") Optional<Integer> p) throws ParseException {
		Sort sort = Sort.by("mahd").descending();
		Pageable pageable = PageRequest.of(p.orElse(0), 4,sort);
		Page<HoaDon> page;
		
		
		String d1 = req.getParameter("nbd");
		String d2 = req.getParameter("nkt");
		
		if(d1 != null) {
			Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(d1);
			Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(d2);
			page = daohd.findDateSort(date1, date2, pageable);
		}else {
			page = daohd.findAllSort(pageable);
		}
		
		
		
		
		List<HoaDon> listhd = daohd.findAll();
		List<ChiTietHoaDon> listcthd;
		if(listGlobal == null) {
			listcthd = daocthd.findAll();
			listGlobal = listcthd;
		}
		model.addAttribute("listhd", page);
		model.addAttribute("listcthd", listGlobal);
		return "admin/index4";
	}
	
	@RequestMapping("/hoadon/all")
	public String showAll(Model model) {
		Sort sort = Sort.by("mahd").descending();
		Pageable pageable = PageRequest.of(0, 4,sort);
		Page<HoaDon> page = daohd.findAllSort(pageable);
		//List<HoaDon> listhd = daohd.findAll();
		List<ChiTietHoaDon> listcthd = daocthd.findAll();
		listGlobal = listcthd;
		//model.addAttribute("listhd", listhd);
		model.addAttribute("listhd", page);
		model.addAttribute("listcthd", listGlobal);
		return "admin/index4";
	}
	
	
	List<ChiTietHoaDon> listGlobal;
	Integer idGlobal;
	@RequestMapping("/hoadon/edit/{id}")
	public String editHoaDon(@PathVariable("id") Integer id,Model model) {
		List<ChiTietHoaDon> list;
		if(id != null) {
			HoaDon entity = daohd.getOne(id);
			model.addAttribute("entity", entity);
			
			req.removeAttribute("listcthd");
			list = daocthd.listById(id);
			listGlobal = list;
		}
		

		
		model.addAttribute("listcthd", listGlobal);
		idGlobal = id;
		return "forward:/index/hoadon";
	}
	
	@RequestMapping("/hoadon/create")
	public String createHoaDon(HoaDon entity) throws ParseException {
		String nl = req.getParameter("nlhd");
		Date ngaylaphd = new SimpleDateFormat("yyyy-MM-dd").parse(nl);
		entity.setNgaylaphd(ngaylaphd);
		NhanVien nv = daonv.getOne(req.getParameter("manv"));
		KhachHang kh = daokh.getOne(req.getParameter("makh"));
		entity.setNhanvien(nv);
		entity.setKhachhang(kh);
		HoaDon hd = daohd.save(entity);
		return "redirect:/index/hoadon";
	}
	@RequestMapping("/hoadon/update")
	public String updateHoaDon(HoaDon entity) throws ParseException {
		String nl = req.getParameter("nlhd");
		Date ngaylaphd = new SimpleDateFormat("yyyy-MM-dd").parse(nl);
		entity.setNgaylaphd(ngaylaphd);
		NhanVien nv = daonv.getOne(req.getParameter("manv"));
		KhachHang kh = daokh.getOne(req.getParameter("makh"));
		entity.setNhanvien(nv);
		entity.setKhachhang(kh);
		HoaDon hd = daohd.save(entity);
		return "redirect:/index/hoadon";
	}
	
	@RequestMapping("/hoadonct/create")
	public String createHoaDonCT(ChiTietHoaDon cthd,Model model) {
		Integer mahd = Integer.parseInt(req.getParameter("mahd"));
		HoaDon hd = daohd.getOne(mahd);
		cthd.setHoadon(hd);
		Integer masp= Integer.parseInt(req.getParameter("masp")); 
		SanPham sp = daosp.getOne(masp);
		cthd.setSanpham(sp);
		ChiTietHoaDon cthdnew = daocthd.save(cthd);
		
		List<ChiTietHoaDon> list = daocthd.listById(cthdnew.getHoadon().getMahd());
		listGlobal = list;
		model.addAttribute("listcthd", listGlobal);
		return "forward:/index/hoadon";
	}
	@RequestMapping("/hoadonct/update")
	public String updateHoaDonCT(ChiTietHoaDon cthd,Model model) {
		Integer mahd = Integer.parseInt(req.getParameter("mahd"));
		HoaDon hd = daohd.getOne(mahd);
		cthd.setHoadon(hd);
		Integer masp= Integer.parseInt(req.getParameter("masp")); 
		SanPham sp = daosp.getOne(masp);
		cthd.setSanpham(sp);
		ChiTietHoaDon cthdnew = daocthd.save(cthd);
		
		List<ChiTietHoaDon> list = daocthd.listById(cthdnew.getHoadon().getMahd());
		listGlobal = list;
		model.addAttribute("listcthd", listGlobal);
		return "forward:/index/hoadon";
	}
	
	@RequestMapping("/hoadonct/edit/{id}")
	public String editHoaDonCT(@PathVariable("id") Integer id,Model model) {
		model.addAttribute("listcthd", listGlobal);
		ChiTietHoaDon entity = daocthd.getOne(id);
		model.addAttribute("entity2", entity);
		return "forward:/index/hoadon";
	}
	
	@RequestMapping("/hoadon/delete/{id}")
	public String deleteHoaDon(@PathVariable("id") Integer id,Model model) {
		daohd.deleteById(id);
		return "redirect:/index/hoadon"; 
	}
	@RequestMapping("/hoadonct/delete/{id}")
	public String deleteHoaDonCT(@PathVariable("id") Integer id,Model model) {
		daocthd.deleteById(id);
		List<ChiTietHoaDon> list = daocthd.listById(idGlobal);
		listGlobal = list;
		model.addAttribute("listcthd", listGlobal);
		return "forward:/index/hoadon"; 
	}
	
	
	@RequestMapping("/danhmuc")
	public String indexShow5(Model model) {
		List<DanhMuc> listdm = daodm.findAll();
		model.addAttribute("list", listdm);
		return "admin/index5";
	}
	
	@RequestMapping("/danhmuc/edit/{id}")
	public String editDanhMuc(@PathVariable("id") Integer id,Model model) {
		DanhMuc dm = daodm.getOne(id);
		model.addAttribute("entity", dm);
		return "forward:/index/danhmuc";
	}
	
	@RequestMapping("/danhmuc/create")
	public String createDanhMuc(DanhMuc entity) {
		DanhMuc dm = daodm.save(entity);
		return "redirect:/index/danhmuc";
	}
	
	@RequestMapping("/danhmuc/update")
	public String updateDanhMuc(DanhMuc entity) {
		DanhMuc dm = daodm.save(entity);
		return "redirect:/index/danhmuc";
	}
	
	@RequestMapping("/danhmuc/delete/{id}")
	public String deleteDanhMuc(@PathVariable("id") Integer id) {
		daodm.deleteById(id);
		return "redirect:/index/danhmuc";
	}
	
	@RequestMapping("/report")
	public String reportItem(Model model) {
		List<Report> items = daocthd.getInventoryByCategory();
		model.addAttribute("items", items);
		return "admin/index6";
	}
	
}

package com.poly.AssignmentJava5.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.mail.internet.MimeMessage;
import javax.persistence.EntityManager;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.poly.AssignmentJava5.Utils.ArrayTemp;
import com.poly.AssignmentJava5.dao.ChiTietHoaDonDAO;
import com.poly.AssignmentJava5.dao.DanhMucDAO;
import com.poly.AssignmentJava5.dao.HoaDonDAO;
import com.poly.AssignmentJava5.dao.KhachHangDAO;
import com.poly.AssignmentJava5.dao.NhanVienDAO;
import com.poly.AssignmentJava5.dao.SanPhamDAO;
import com.poly.AssignmentJava5.entity.ChiTietHoaDon;
import com.poly.AssignmentJava5.entity.DanhMuc;
import com.poly.AssignmentJava5.entity.HoaDon;
import com.poly.AssignmentJava5.entity.ItemHoaDon;
import com.poly.AssignmentJava5.entity.KhachHang;
import com.poly.AssignmentJava5.entity.NhanVien;
import com.poly.AssignmentJava5.entity.SanPham;
import com.poly.AssignmentJava5.services.GioHangServices;
import com.poly.AssignmentJava5.services.SessionService;

@Controller
public class CustomerController {
	@Autowired
	DanhMucDAO daoDM;
	
	@Autowired
	SessionService session;
	
	@Autowired
	SanPhamDAO daoSP;
	
	@Autowired
	ArrayTemp util;
	
	@Autowired
	GioHangServices cart;
	
	@Autowired
	EntityManager em;
	
	@Autowired
	HttpServletRequest req;
	
	@Autowired
	HoaDonDAO daohd;
	
	@Autowired
	ChiTietHoaDonDAO daocthd;
	
	@Autowired
	KhachHangDAO daokh;
	
	@Autowired
	NhanVienDAO daonv;
	
	@Autowired
	JavaMailSender mailer;
	
	@RequestMapping("/index")
	public String indexShow(Model model,@RequestParam(name = "iddm",defaultValue = "") Integer iddm) {
//		if(util.listItemGioHang == null) {
//			SimpleJpaRepository<SanPham, Integer> repo = new SimpleJpaRepository<SanPham,Integer >(SanPham.class,em);
//			for (SanPham it : repo.findAll()) {
//				util.listItemGioHang.put(it.getMasp(), new ItemHoaDon(it,1));
//			}
//		}
		
		
		List<DanhMuc> listDM = daoDM.findAll();
		model.addAttribute("items", listDM);
		
		//List<SanPham> listSP ;
		
		//Filter By DanhMuc
		Pageable pageable = PageRequest.of(0, 6);
		Page<SanPham> page;
//		if(iddm == null) {
//			listSP = daoSP.findAll();
//		}else if(iddm == 0){
//			listSP = daoSP.findAll();
//		}else {
//			listSP = daoSP.findByDanhMucId(iddm);
//		}
		if(iddm == null) {
			page = daoSP.findAll(pageable);
		}else if(iddm == 0){
			page = daoSP.findAll(pageable);
		}else {
			page = daoSP.pageFindIdDM(iddm, pageable);
			util.iddm = iddm;
		}
		util.pageSP = page;
//		List<SanPham> listSP = daoSP.findAll();
		//model.addAttribute("products", listSP);
		
		//List<SanPham> list = daoSP.sortSanPham(pageable.getSort());
		model.addAttribute("products", page);
		return "customer/index";
	}
	
	@RequestMapping("/index/sort")
	public String indexFilterSort(Model model,@RequestParam(name = "sort",defaultValue = "") String sort) {
		List<DanhMuc> listDM = daoDM.findAll();
		model.addAttribute("items", listDM);
		
		Sort sortable = null;
	    if (sort.equals("asc")) {
	      sortable = Sort.by("dongia").ascending();
	    }
	    if (sort.equals("desc")) {
	      sortable = Sort.by("dongia").descending();
	    }
	    util.sorttable = sortable;
	    Pageable pageable = PageRequest.of(0, 6, sortable);
	    Page<SanPham> page;
	    if(util.iddm == null) {
	    	page = daoSP.findAll(pageable);
	    }else {
	    	page = daoSP.pageFindIdDM(util.iddm, pageable);
	    }
	    util.pageSP = page;
	    model.addAttribute("products", page);
		//List<SanPham> list;
		// Sort By Gia
//		if (sort == "") {
//			list.listSP = daoSP.findAll();
//		} else if (sort.equals("asc")) {
//			list.listSP.sort(Comparator.comparing(SanPham::getDongia));
//		} else if (sort.equals("desc")) {
//			list.listSP.sort(Comparator.comparing(SanPham::getDongia).reversed());
//		}
//		model.addAttribute("products", list.listSP);
		
//		if(sort.equals("asc")) {
//			list = daoSP.sortSanPham(Sort.by(Direction.ASC,"dongia"));
//		}else {
//			list = daoSP.sortSanPham(Sort.by(Direction.DESC,"dongia"));
//		}
//		model.addAttribute("products", list);
		
		return "customer/index";
	}
	
	@RequestMapping("/index/fil")
	public String indexFilBetweenPrice(Model model,@RequestParam("min") double min,@RequestParam("max") double max) {
		List<DanhMuc> listDM = daoDM.findAll();
		model.addAttribute("items", listDM);
		Pageable pageable;
		if(util.sorttable != null) {
			pageable = PageRequest.of(0, 6, util.sorttable);
		}else {
			pageable = PageRequest.of(0, 6);
		}
		Page<SanPham> page;
//	    if(util.iddm == -1) {
//	    	page = daoSP.findAll(pageable);
//	    }else {
//	    	page = daoSP.pageFindIdDM(util.iddm, pageable);
//	    }
		
		if(util.iddm == null) {
			page = daoSP.findAll(pageable);
		}else {
			//page = daoSP.pageFindIdDM(util.iddm, pageable);
			System.out.println(util.iddm);
			page = daoSP.pageDMDonGia(util.iddm, min*1000000, max*1000000, pageable);
			System.out.println(page.getTotalElements());
		}
		util.pageSP = page;
		model.addAttribute("products", page);
//		List<SanPham> list = daoSP.findByDongiaBetween(min*1000000, max*1000000);
//		model.addAttribute("products", list);
		
		return "customer/index";
	}
	
	@RequestMapping("/index/page")
	public String indexPage(Model model,@RequestParam("p") Optional<Integer> p) {
		List<DanhMuc> listDM = daoDM.findAll();
		model.addAttribute("items", listDM);
		Pageable pageable;
		if(p.orElse(0) < 0) {
			pageable = PageRequest.of(0, 6);
		}else {
			pageable = PageRequest.of(p.orElse(0), 6);
		}
		Page<SanPham> page = daoSP.findAll(pageable);
		util.pageSP = page;
		//List<SanPham> list = daoSP.sortSanPham(pageable.getSort());
		model.addAttribute("products", page);
		return "customer/index";
	}
	
	
	@RequestMapping("/index/giohang")
	public String view(Model model) {
		model.addAttribute("cart", cart);
		return "customer/GioHang";
	}
	
	@RequestMapping("/index/cart/add/{id}")
	public String add(@PathVariable("id") Integer masp,Model model) {
		cart.getItems();
		cart.add(masp);
		model.addAttribute("amount", cart.getAmount());
		model.addAttribute("products", util.pageSP);
		return "customer/index";
	}
	@RequestMapping("/index/cart/remove/{id}")
	public String remove(@PathVariable("id") Integer masp) {
		cart.remove(masp);
		return "redirect:/index/giohang";
	}
	@RequestMapping("/index/cart/update/{id}")
	public String update(@PathVariable("id") Integer masp) {
		int qty = Integer.parseInt(req.getParameter("items" +  String.valueOf(masp)));
		System.out.println(qty + "item" + String.valueOf(masp));
		cart.update(masp, qty);
		return "redirect:/index/giohang";
	}
	@RequestMapping("/index/cart/clear")
	public String clear() {
		cart.clear();
		return "redirect:/index/giohang";
	}
	
	@RequestMapping("/index/cart/dathang")
	public String dathang(Model model) {
		
		if(cart.getItems() != null) {
			String pattern = "yyyy-MM-dd";
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			
			KhachHang kh = new KhachHang();
			kh.setMakh("KH001");
			
			NhanVien nv = new NhanVien();
			nv.setManv("NV001");
			
			String status = req.getParameter("trangthai");
			boolean trangthai;
			if(status.equalsIgnoreCase("TRUE")) {
				trangthai = true;
			}else {
				trangthai = false;
			}
			
			HoaDon entity = new HoaDon();
			entity.setTongtien(cart.getAmount());
			entity.setNgaylaphd(new Date());
			entity.setKhachhang(kh);
			entity.setNhanvien(nv);
			entity.setDiachinh(req.getParameter("diachinh"));
			entity.setTrangthai(trangthai);
			entity.setSdt(req.getParameter("sdt"));
			HoaDon entity2 = daohd.save(entity);
			for(ItemHoaDon item : cart.getItems()) {
				ChiTietHoaDon cthd = new ChiTietHoaDon();
				cthd.setHoadon(entity2);
				cthd.setSanpham(item.getSp());
				cthd.setDongia(item.getSp().getDongia());
				cthd.setSoluong(item.getSoluong());
				cthd.setTongtien(item.getSp().getDongia() * item.getSoluong());
				
				ChiTietHoaDon cthd2 = daocthd.save(cthd);
//				System.out.println(item.getSp().getTensp());
//				System.out.println(item.getSoluong());
//				System.out.println(item.getTongtien());
//				System.out.println(cart.getAmount());
//				
//
//				System.out.println(simpleDateFormat.format(new Date()));
//				System.out.println("-------------------------------");
			}
			cart.clear();
		}
		
		
		return "redirect:/index/giohang";
	}
	
	
	@RequestMapping("/index/dangki")
	public String indexShow2() {
		return "customer/DangKi";
	}
	@RequestMapping("/index/dangki/add")
	public String indexAddDangKi(KhachHang kh,Model model) throws ParseException {
		String ns = req.getParameter("ns");
		Date ngaysinh = new SimpleDateFormat("yyyy-MM-dd").parse(ns);
		kh.setNgaysinh(ngaysinh);
		
		KhachHang newKH = daokh.save(kh);
		model.addAttribute("message", "Đăng kí thành công !");
		return "forward:/index/dangki";
		
	}
	
	@RequestMapping("/index/dangnhap")
	public String indexShow3() {
		return "customer/DangNhap";
	}
	
	@PostMapping("/index/dangnhap")
	public String dangNhapPost(@RequestParam("username") String username,
								@RequestParam("password") String password,
								Model model) {
		boolean check = req.getParameter("remember") != null ? true:false;
		if(username.contains("KH")) {
			try {
				KhachHang user = daokh.getById(username);
				if(!user.getPassword().equals(password)) {
					model.addAttribute("message", "Invalid password");
				} else {
					session.set("user2", user);
					session.set("user", null);
					model.addAttribute("message", "Login succeed");
				}
			} catch (Exception e) {
				model.addAttribute("message", "Invalid username");
			}
		}
		if (username.contains("NV")){
			try {
				NhanVien user = daonv.getById(username);
				if(!user.getPassword().equals(password)) {
					model.addAttribute("message", "Invalid password");
				} else {
					session.set("user", user);
					String uri = session.get("security-uri");
					if(uri != null) {
						return "redirect:" + uri;
					} else {
						
						System.out.println("Thanh cong");
						model.addAttribute("message", "Login succeed");
					}
				}
			} catch (Exception e) {
				model.addAttribute("message", "Invalid username");
			}
		}
		return "customer/DangNhap";
	}
	
	@RequestMapping("/index/quenmatkhau")
	public String quenmatkhau(Model model) {
		String username = req.getParameter("username");
		List<KhachHang> kh = daokh.khachHangFindId(username);
		String from = "bangphin1@gmail.com";
		System.out.println(username);
		if(kh != null) {
			KhachHang entity = daokh.getOne(username);
			try {
				// Tạo mail
				MimeMessage mail = mailer.createMimeMessage();
				
				// Sử dụng lớp trợ giúp
				MimeMessageHelper helper = new MimeMessageHelper(mail);
				helper.setFrom("CellphoneS","CellphoneS");
				helper.setTo(entity.getEmail());
				helper.setReplyTo("CellphoneS","CellphoneS");
				helper.setSubject("CellphoneS hỗ trợ khách hàng");
				helper.setText("Mật khẩu của bạn là: " + entity.getPassword(),true);
				
				// Gửi mail
				mailer.send(mail);
				
				model.addAttribute("message", "Gửi mail thành công !");
				
			} catch (Exception e) {
				model.addAttribute("message", "Gửi email thất bại !");
			}
		}
		System.out.println("Thanh cong");
		return "customer/DangNhap";
	}
	
//	@RequestMapping("/index/giohang")
//	public String indexShow4(Model model) {
//		model.addAttribute("cart", cart);
//		return "customer/GioHang";
//	}
}

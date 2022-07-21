package com.poly.AssignmentJava5.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.HandlerInterceptor;

import com.poly.AssignmentJava5.entity.KhachHang;
import com.poly.AssignmentJava5.entity.NhanVien;
import com.poly.AssignmentJava5.services.SessionService;

@Service
public class AuthInterceptor implements HandlerInterceptor{
	@Autowired
	SessionService session;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
				String uri = request.getRequestURI();
				NhanVien user = session.get("user"); // lấy từ session
				KhachHang kh = session.get("user2");
				String error = "";
					
				
				if(user == null) { // chưa đăng nhập
					error = "Please login!";
				}
				
				// không đúng vai trò
//				else if(uri.startsWith("/index/nhanvien/") || uri.startsWith("/index/khachhang/") || uri.startsWith("/index/sanpham") 
//						|| uri.startsWith("/index/hoadon/") || uri.startsWith("/index/hoadonct")) {
//					error = "Access denied!";
//				}
				if(error.length() > 0) { // có lỗi
					session.set("security-uri", uri);
					response.sendRedirect("/index/dangnhap?error=" + error);
					return false;
				}
				return true;
	}
}

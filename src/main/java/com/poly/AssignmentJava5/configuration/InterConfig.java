package com.poly.AssignmentJava5.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.poly.AssignmentJava5.interceptor.AuthInterceptor;

@Configuration
public class InterConfig implements WebMvcConfigurer{
	@Autowired
	AuthInterceptor auth;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	registry.addInterceptor(auth)
		.addPathPatterns("/index/nhanvien/**","/index/khachhang/**","/index/sanpham/**","/index/hoadon/**","/index/hoadonct/**")
		.excludePathPatterns("/admin/**", "/customer/**","/index/dangnhap");
	}
}

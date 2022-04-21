package com.myspring.tiger1.cs.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component("csVO")
public class CsVO {
	
	private String notice_id;
	private String user_id;
	private String notice_category;
	private String notice_pw;
	private String notice_title;
	private String notice_body;
	private Date notice_cre_date;
	private int notice_grade;
	private int notice_private;
	private String notice_type;
	private int order_id;
	private String product_id;
	
	
	public String getNotice_id() {
		return notice_id;
	}
	public void setNotice_id(String notice_id) {
		this.notice_id = notice_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getNotice_category() {
		return notice_category;
	}
	public void setNotice_category(String notice_category) {
		this.notice_category = notice_category;
	}
	public String getNotice_pw() {
		return notice_pw;
	}
	public void setNotice_pw(String notice_pw) {
		this.notice_pw = notice_pw;
	}
	public String getNotice_title() {
		return notice_title;
	}
	public void setNotice_title(String notice_title) {
		this.notice_title = notice_title;
	}
	public String getNotice_body() {
		return notice_body;
	}
	public void setNotice_body(String notice_body) {
		this.notice_body = notice_body;
	}
	public Date getNotice_cre_date() {
		return notice_cre_date;
	}
	public void setNotice_cre_date(Date notice_cre_date) {
		this.notice_cre_date = notice_cre_date;
	}
	public int getNotice_grade() {
		return notice_grade;
	}
	public void setNotice_grade(int notice_grade) {
		this.notice_grade = notice_grade;
	}
	public int getNotice_private() {
		return notice_private;
	}
	public void setNotice_private(int notice_private) {
		this.notice_private = notice_private;
	}
	public String getNotice_type() {
		return notice_type;
	}
	public void setNotice_type(String notice_type) {
		this.notice_type = notice_type;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	
}
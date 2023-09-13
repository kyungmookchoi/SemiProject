package com.semi.main.payment;

import java.sql.Date;



public class PaymentDTO {
	
	private String paymentNo;
	private String proName;
	private Long totalPrice;
	private String name;
	private String phone;
	private String uidNo;
	private Long userNo;
	private Long proNo;
	private Integer StatusNo;
	private Date paymentDate;
	private String reason;
	
	public String getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}
	public Long getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Long totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getUidNo() {
		return uidNo;
	}
	public void setUidNo(String uidNo) {
		this.uidNo = uidNo;
	}
	public Integer getStatusNo() {
		return StatusNo;
	}
	public void setStatusNo(Integer statusNo) {
		StatusNo = statusNo;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Long getUserNo() {
		return userNo;
	}
	public void setUserNo(Long userNo) {
		this.userNo = userNo;
	}
	public Long getProNo() {
		return proNo;
	}
	public void setProNo(Long proNo) {
		this.proNo = proNo;
	}

	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}


}
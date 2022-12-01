package com.mvnhibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.Columns;

@Entity
@Table(name="Bank")
public class BankData {

	@Id
	private int acc_no;
	
	@Column(name="XYZ")
	private String custm_name;
	
	private String br_name;
	public BankData() {
		super();
	}
	public BankData(int acc_no, String custm_name, String br_name) {
		super();
		this.acc_no = acc_no;
		this.custm_name = custm_name;
		this.br_name = br_name;
	}
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getCustm_name() {
		return custm_name;
	}
	public void setCustm_name(String custm_name) {
		this.custm_name = custm_name;
	}
	public String getBr_name() {
		return br_name;
	}
	public void setBr_name(String br_name) {
		this.br_name = br_name;
	}
	@Override
	public String toString() {
		return "BankData [acc_no=" + acc_no + ", custm_name=" + custm_name + ", br_name=" + br_name + "]";
	}
	
	
}

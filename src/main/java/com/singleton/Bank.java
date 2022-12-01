package com.singleton;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

	@Id
	private int acc_no;
	private int ammount;
	private String bank_name;
	private String name;

	public Bank(int acc_no, int ammount, String bank_name, String name) {
		super();
		this.acc_no = acc_no;
		this.ammount = ammount;
		this.bank_name = bank_name;
		this.name = name;
	}

	public String toString() {
		return "Bank [acc_no=" + acc_no + ", ammount=" + ammount + ", bank_name=" + bank_name + ", name=" + name + "]";
	}

	public int getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}

	public int getAmmount() {
		return ammount;
	}

	public void setAmmount(int ammount) {
		this.ammount = ammount;
	}

	public String getBank_name() {
		return bank_name;
	}

	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}

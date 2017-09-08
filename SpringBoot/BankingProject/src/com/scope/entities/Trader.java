package com.scope.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Email;
import org.springmodules.validation.bean.conf.loader.annotation.handler.Length;
import org.springmodules.validation.bean.conf.loader.annotation.handler.NotBlank;
@Entity
@Table(name="irs.ScopeTraderNew")
public class Trader {
   
	
	@NumberFormat(style = Style.NUMBER)
	@Id
	@Column(name="Trader_Id")
	private int traderId;
	
	@NotBlank(message = "traderName must not be blank.")
	@Size(min=5,max=20, message = "traderName must be bewteen 5 and 20.")
	@Column(name="Trader_Name")
	private String traderName;
	@NotNull
	@NotBlank(message = "address must not be blank.")
	@Column(name="Trader_Address")
	private String address;
	@NotNull
	@NotBlank(message = "email must not be blank.")
	@Email(message = "check email format.")
	@Column(name="Trader_Email")
	private String email;
	//@NotEmpty
	//@Size(min = 1, max = 20)
	//private String userName;
	//@NotNull
	//@NumberFormat(style = Style.NUMBER)
	//@Min(1)
	//@Max(110)
	//private Integer age;
	//@NotEmpty(message = "Password must not be blank.")
	//@Size(min = 1, max = 10, message = "Password must be between 1 to 10 Characters.")
	@Column(name="Trader_Password")
	private String password;
	@Column(name="Bank_Id")
	private int bankId;
	public int getTraderId() {
		return traderId;
	}
	public void setTraderId(int traderId) {
		this.traderId = traderId;
	}
	public String getTraderName() {
		return traderName;
	}
	public void setTraderName(String traderName) {
		this.traderName = traderName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getBankId() {
		return bankId;
	}
	public void setBankId(int bankId) {
		this.bankId = bankId;
	}
}

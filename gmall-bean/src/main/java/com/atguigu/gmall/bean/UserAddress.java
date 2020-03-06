package com.atguigu.gmall.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
public class UserAddress implements Serializable{
	@Id
	@Column
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	@Column
	private String userAddress;
	@Column
	private String userId;
	@Column
	private String consignee;
	@Column
	private String phoneNum;
	@Column
	private String isDefault;


}

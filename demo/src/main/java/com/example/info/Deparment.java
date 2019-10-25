package com.example.info;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @ClassName:     Deparment.java
 * @Description:   部门类
 * @author:        mazhuo
 * @version:       V1.0  
 * @Date:          2019年10月25日 上午9:34:02 
 */
@Entity
@Table(name = "DEPARMENT")
public class Deparment {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "payableid_seq")
	@SequenceGenerator(name = "payableid_seq",sequenceName = "SEQ_A_ID")
	private long id;
	private String name;
	/** 
	 * @Title: 
	 * @Description:  
	 */
	public Deparment() {
	}
	
}

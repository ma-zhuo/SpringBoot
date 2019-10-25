package com.example.info;

import javax.persistence.*;

/**
 * @ClassName:     Role.java
 * @Description:   TODO
 * @author:        mazhuo
 * @version:       V1.0  
 * @Date:          2019年10月25日 上午11:24:54 
 */
@Entity
@Table(name = "ROLE_NEW")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "payableid_seq")
	@SequenceGenerator(name = "payableid_seq",sequenceName = "SEQ_A_ID")
	private Long id;
    private String name;
    public Role() {
    };
}

package com.example.info;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonBackReference;

/**
 * @ClassName:     User.java
 * @Description:   用户表，与部门表多对一的关系
 * @author:        mazhuo
 * @version:       V1.0  
 * @Date:          2019年10月25日 上午10:50:15 
 */
@Entity
@Table(name = "USER_NEW")
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "payableid_seq")
	@SequenceGenerator(name = "payableid_seq",sequenceName = "SEQ_A_ID")
	private Long id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdate;
    @ManyToOne
    @JoinColumn(name = "did")
    @JsonBackReference
    private Deparment deparment;
    @ManyToMany(cascade = {},fetch = FetchType.EAGER)
    @JoinTable(name = "user_role",
    		joinColumns = {@JoinColumn(name = "user_id")},
    		inverseJoinColumns = {@JoinColumn(name = "roles_id")})
    private List<Role> roles;
	public User() {
	}
}

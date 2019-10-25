package com.example.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.info.User;

/**
 * @ClassName:     UserRepository.java
 * @Description:   TODO 用户实体持久化
 * @author:        mazhuo
 * @version:       V1.0  
 * @Date:          2019年10月25日 上午11:38:46 
 */
public interface UserRepository extends JpaRepository<User, Long>{

}

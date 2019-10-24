package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @ClassName:     Application.java
 * @Description:   TODO
 * @author:        mazhuo
 * @version:       V1.0  
 * @Date:          2019年10月24日 下午4:40:30 
 */

@SpringBootApplication
@RestController
public class Application {

	@RequestMapping("/")
	String Home(){
		return "hello";
	}
	/** 
	 * @Title: main 
	 * @Description: TODO
	 * @param @param args    设定文件 
	 * @return void    返回类型 
	 * @throws 
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

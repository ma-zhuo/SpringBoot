package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;

/**
 * @ClassName:     JpaConfiguration.java
 * @Description:   TODO
 * @author:        mazhuo
 * @version:       V1.0  
 * @Date:          2019年10月25日 下午12:58:28 
 */

public class JpaConfiguration {
	
	@Bean
	PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor(){
		return new PersistenceExceptionTranslationPostProcessor();
	}
}

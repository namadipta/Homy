package com.app.homy.database;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author namadipta
 *
 */
@MapperScan("com.app.homy.mapper")
@SpringBootApplication
public class HomyDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomyDbApplication.class, args);
	}
}

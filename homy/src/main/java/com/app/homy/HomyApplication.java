package com.app.homy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//import com.app.homy.common.context.CommonData;

@SpringBootApplication
@MapperScan({"com.app.homy.common"})
public class HomyApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomyApplication.class, args);
	   // final CommonData commonData = new CommonData();
//		//log.setClientIp(this.getClientIP(httpRequest));
		//String transactionId ="Test";
//		log.setTransactionId(transactionId);
//		log.setServerHostIp(serverAddress.getHostAddress());
//		log.setAppName(logBackAppName);
	}
}

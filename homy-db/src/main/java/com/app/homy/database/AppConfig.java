package com.app.homy.database;
///**
// * 
// */
//package com.app.homy.database;
//
//import javax.sql.DataSource;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
//
///**
// * @author namadipta
// *
// */
//@Configuration
//@MapperScan("com.homy.mapper")
//public class AppConfig {
//
//	@Bean
//	   public DataSource dataSource() {
//	     return new EmbeddedDatabaseBuilder()
//	              //.addScript("schema.sql")
//	              .build();
//	   }
//
//	   @Bean
//	   public DataSourceTransactionManager transactionManager() {
//	     return new DataSourceTransactionManager(dataSource());
//	   }
//
//	   @Bean
//	   public SqlSessionFactory sqlSessionFactory() throws Exception {
//	     SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//	     sessionFactory.setDataSource(dataSource());
//	     return sessionFactory.getObject();
//	   }
//}

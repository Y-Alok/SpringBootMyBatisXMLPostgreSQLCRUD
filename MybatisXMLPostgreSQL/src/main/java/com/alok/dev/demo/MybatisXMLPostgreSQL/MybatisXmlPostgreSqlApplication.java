package com.alok.dev.demo.MybatisXMLPostgreSQL;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* Set the package where the mapper interface resides
(there can be more than one) via the @MapperScan annotation.
 */
@MapperScan("com.alok.dev.demo.MybatisXMLPostgreSQL.repository")
public class MybatisXmlPostgreSqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisXmlPostgreSqlApplication.class, args);
	}

}

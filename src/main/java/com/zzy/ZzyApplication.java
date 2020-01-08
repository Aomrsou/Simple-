package com.zzy;

import com.zzy.mapper.VdStuMapper;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class ZzyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZzyApplication.class, args);
	}

}

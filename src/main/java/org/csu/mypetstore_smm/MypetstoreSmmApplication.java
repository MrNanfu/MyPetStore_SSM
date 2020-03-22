package org.csu.mypetstore_smm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.csu.mypetstore_smm.persistence")
public class MypetstoreSmmApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypetstoreSmmApplication.class, args);
	}

}

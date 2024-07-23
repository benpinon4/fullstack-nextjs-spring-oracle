package com.example.fullstack_spring_server;


import oracle.jdbc.pool.OracleDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.springframework.boot.CommandLineRunner;


@SpringBootApplication
public class FullstackSpringServerApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FullstackSpringServerApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("spring.data"); // jdbc:oracle:thin@[hostname]:[port]/[DB service name]
		ods.setUser("SYSTEM");
		ods.setPassword("Nola110916!!");
		Connection conn = ods.getConnection();

		PreparedStatement stmt = conn.prepareStatement("SELECT 'Hello World!' FROM dual");
		ResultSet rslt = stmt.executeQuery();
		while (rslt.next()) {
			System.out.println(rslt.getString(1));
		}
	}

}

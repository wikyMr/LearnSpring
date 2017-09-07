package com.wiky.demo;

import javax.sql.DataSource;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication 
@EnableSwagger2
@MapperScan("com.wiky.demo.dao")
public class Application {

    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	SpringApplication.run(Application.class,args);
    }
}

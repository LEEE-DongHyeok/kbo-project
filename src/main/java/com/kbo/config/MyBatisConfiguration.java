package com.kbo.config;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@RequiredArgsConstructor
@Configuration
public class MyBatisConfiguration {

    @Bean
    DataSource dataSource(){
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
        dataSourceBuilder.url("jdbc:mysql://localhost:3306/mybatis_test?useUnicode=yes&characterEncoding=UTF-8&allowMultiQueries=true&serverTimezone=Asia/Seoul");
        dataSourceBuilder.username("username");
        dataSourceBuilder.password("password");
        return dataSourceBuilder.build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory (DataSource dataSource){

        // 1. FactoryBean 클래스 이용하는 방법
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource();


        // 2. FactoryBuilder 클래스를 이용하는 방법
        // FactoryBuilder 생성
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        // FactoryBuilder 로 Factory 생성 (build 시 다양한 방법이 있지만 Config 클래스로)
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(dataSource);
        // Factory 로 세션 생성
        SqlSession sqlSession = sqlSessionFactory.openSession();

    }
}

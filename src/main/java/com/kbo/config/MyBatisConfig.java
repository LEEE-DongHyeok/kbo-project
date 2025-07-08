package com.kbo.config;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.sql.DataSource;


// Mapper Scan 정보 주입 (탐색할 패키지, 표기할 커스텀 어노테이션, SqlSessionFactory 객체의 레퍼런스 지정)
@Configuration
@MapperScan("com.kbo.*/**")
@RequiredArgsConstructor
@EnableConfigurationProperties(DataSourceConfig.class)
public class MyBatisConfig {

    private final ApplicationContext applicationContext;
    private final DataSourceProperties dataSourceProperties;
    private final DataSourceConfig dataSourceConfiguration;

    @PostConstruct
    public void checkProps() {
        System.out.println("URL: " + dataSourceConfiguration.getUrl());
    }

    @Bean
    public DataSource dataSource() {
//        // 임시 하드 코딩
//        return DataSourceBuilder.create()
//                .driverClassName(dbConfiguration.getDriverClass())
//                .url(dbConfiguration.getUrl())
//                .username(dbConfiguration.getUserName())
//                .password(dbConfiguration.getPassword()).build();

//        return dataSourceProperties.initializeDataSourceBuilder().build();

        // 커스텀, 수동으로 밀어넣기
        return DataSourceBuilder.create()
                .driverClassName(dataSourceConfiguration.getDriverClassName())
                .url(dataSourceConfiguration.getUrl())
                .username(dataSourceConfiguration.getUsername())
                .password(dataSourceConfiguration.getPassword()).build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactory sqlSessionFactory;

//--------------------------------------------------------------------------------------------------

        // 1. FactoryBean 클래스 이용하는 방법 (MyBatis-Spring 모듈 / org.mybatis:mybatis-spring:1.3.2)
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:config/mybatis-config.xml"));
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("classpath:com.kbo.*.**"));
        sqlSessionFactory = sqlSessionFactoryBean.getObject();

//--------------------------------------------------------------------------------------------------
        // 2. FactoryBuilder 클래스를 이용하는 방법(MyBatis 모듈 / org.mybatis:mybatis:3.4.6)
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

//        // FactoryBuilder 로 Factory 를 빌드하기 위해 파라미터로 넣을 Configuration, Environment, TransactionFactory 생성
//        TransactionFactory transactionFactory = new JdbcTransactionFactory();
//        Environment environment = new Environment("kbo", transactionFactory, dataSource);
//        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration(environment);

//        // FactoryBuilder 로 Factory 생성 (build 시 다양한 방법이 있지만 Configuration 클래스로)
//        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(configuration);

//        // Factory 로 세션 생성
//        SqlSession sqlSession = sqlSessionFactory.openSession();

//--------------------------------------------------------------------------------------------------
        return sqlSessionFactory;
    }
}

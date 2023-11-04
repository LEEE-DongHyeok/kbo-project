package com.kbo.config;

import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


@MapperScan(basePackages = MyBatisConfiguration.BASE_PACKAGE, annotationClass = MyBatisCustomAnnotation.class, sqlSessionFactoryRef = "sqlSessionFactory")
@RequiredArgsConstructor
@Configuration
public class MyBatisConfiguration {

    private final ApplicationContext applicationContext;
    public static final String BASE_PACKAGE = "com.kbo.*/**";
    //public static final String CONFIG_LOCATION_PATH = "classpath:config/mybatis-config.xml";
    public static final String MAPPER_LOCATIONS_PATH = "com.kbo.*/**.xml";
    // SqlSessionFactory 객체 생성을 위해서 set 할 DataSource Bean 등록
    @Bean
    public DataSource dataSource (){
        return DataSourceBuilder.create().build();
    }


    @Bean
    public SqlSessionFactory sqlSessionFactory () throws Exception {
        SqlSessionFactory sqlSessionFactory;

//--------------------------------------------------------------------------------------------------
        // 1. FactoryBean 클래스 이용하는 방법(org.mybatis:mybatis-spring:1.3.2)
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setConfigLocation(applicationContext.getResource("classpath:mybatis/mybatis-config.xml"));
        sqlSessionFactoryBean.setMapperLocations(applicationContext.getResources("com.kbo.*/**.xml"));
        // sqlSessionFactoryBean.setConfigurationProperties();
        sqlSessionFactory = sqlSessionFactoryBean.getObject();

//--------------------------------------------------------------------------------------------------
        // 2. FactoryBuilder 클래스를 이용하는 방법(org.mybatis:mybatis:3.4.6)
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

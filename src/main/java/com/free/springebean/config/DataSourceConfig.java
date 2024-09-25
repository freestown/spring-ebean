package com.free.springebean.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * 描述
 *
 * @author zhaolongfei007
 * @date 2024/9/25 20:29
 */
@Configuration
public class DataSourceConfig {

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Value("${datasource.url}")
    private String url;

    @Value("${datasource.driver-class-name}")
    private String databaseDriver;

    @Bean
    public DataSource dataSource() throws SQLException {

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl(url);
        config.setUsername(username);
        config.setPassword(password);
        config.setDriverClassName(databaseDriver);

        return new HikariDataSource(config);
    }
}
